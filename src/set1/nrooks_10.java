package set1;

import java.util.Scanner;

public class nrooks_10 {
    public static boolean canplace(int row,int n,int [][] board,boolean []rookrows,boolean[]rookcols){
        if(row==n){
            return true;
        }
        if(rookrows[row]){
            return canplace(row+1,n,board,rookrows,rookcols);
        }
        for(int c=0;c<n;c++){
            if(!rookcols[c]){
                board[row][c]=1;
                rookrows[row]=true;
                rookcols[c]=true;
                if(canplace(row+1,n,board,rookrows,rookcols)){
                    return true;
                }
                board[row][c]=0;
                rookrows[row]=false;
                rookcols[c]=false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int board[][]=new int[n][n];
        boolean rookrows[]=new boolean[n];
       boolean rookcols[]=new boolean[n];


        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                board[r][c]=s.nextInt();
                if(board[r][c]==1){
                    rookrows[r]=true;
                    rookcols[c]=true;
                }
            }
        }
        if(canplace(0,n,board,rookrows,rookcols)){
             for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(board[r][c]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Not Possible");
        }

    }
}
