import java.util.Scanner;

public class nbishops_09 {
    public static boolean canplace(int row,int n,int [][]board,boolean []bishoprows,boolean []nw,boolean [] sw){
        if(row==n){
            return true;
        }
        if(bishoprows[row]){
            return canplace(row+1,n,board,bishoprows,nw,sw);
        }
        for(int c=0;c<n;c++){
            if(!nw[row+c] && !sw[c-row+n-1]){
                board[row][c]=1;
                bishoprows[row]=true;
                nw[row+c]=true;
                sw[c-row+n-1]=true;
                if(canplace(row+1,n,board,bishoprows,nw,sw)){
                    return true;
                }
                else{
                    board[row][c]=0;
                    bishoprows[row]=false;
                nw[row+c]=false;
                sw[c-row+n-1]=false;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int board[][]=new int[n][n];
        boolean bishoprows[]=new boolean[n];
        boolean nw[]=new boolean[2*n-1];
        boolean sw[]=new boolean[2*n-1];


        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                board[r][c]=s.nextInt();
                if(board[r][c]==1){
                    bishoprows[r]=true;
                    nw[r+c]=true;
                    sw[c-r+n-1]=true;
                }
            }
        }
        if(canplace(0,n,board,bishoprows,nw,sw)){
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
