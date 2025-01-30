package set2;

import java.util.Scanner;

public class cantravelfromsrctodest_35 {
    static boolean found=false;
    public static void traverse(int mat[][],int row,int col,int destrow,int destcol){
        int n=mat.length;
        int m=mat[0].length;
        if(row>=0 && row<n && col>=0 && col<m){
        if(row==destrow && col==destcol){
            found=true;
            return;
        }
        if(mat[row][col]==0 || mat[row][col]==2){
            return;
        }
        mat[row][col]=2;
            traverse(mat,row+1,col,destrow,destcol);
            if(!found){
                traverse(mat,row,col+1,destrow,destcol);
            }
            if(!found){
                traverse(mat,row-1,col,destrow,destcol);
            }
            if(!found){
                traverse(mat,row,col-1,destrow,destcol);
            }
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int srcrow=s.nextInt();
        int srcol=s.nextInt();
        int destrow=s.nextInt();
        int destcol=s.nextInt();
        traverse(mat,srcrow,srcol,destrow,destcol);
        if(found){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
