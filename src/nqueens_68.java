import java.util.Scanner;

public class nqueens_68 {
    public static  boolean solve(int [][]board,int  row,int n,int []rows,int[]cols,int[]nw,int []sw){
        if(row==n){
            return true;
        }
        if(rows[row]==1){
            return solve(board,row+1,n,rows,cols,nw,sw);
        }
        for(int col=0;col<n;col++){
            if(cols[col]==0 && nw[col-row+n-1]==0 && sw[col+row]==0){
                board[row][col]=1;
                rows[row]=1;
                cols[col]=1;
                nw[col-row+n-1]=1;
                sw[col+row]=1;
                if(solve(board,row+1,n,rows,cols,nw,sw)){
                    return true;
                }
                 board[row][col]=0;
                rows[row]=0;
                cols[col]=0;
                nw[col-row+n-1]=0;
                sw[col+row]=0;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [][]board=new int[n][n];
        int rows[]=new int[n];
        int cols[]=new int[n];
        int nw[]=new int [2*n-1];
        int sw[]=new int[2*n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=s.nextInt();
                if(board[i][j]==1){
                    rows[i]=1;
                    cols[j]=1;
                    nw[j-i+n-1]=1;
                    sw[i+j]=1;
                }
            }
        }
        if(solve(board,0,n,rows,cols,nw,sw)){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Not possible");
        }
    }
}
/*
Test Case 1:
4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
Output:
0 1 0 0
0 0 0 1
1 0 0 0
0 0 1 0
Test Case 2:
8
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
Output:
1 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 1
0 0 0 0 0 1 0 0
0 0 1 0 0 0 0 0
0 0 0 0 0 0 1 0
0 1 0 0 0 0 0 0
0 0 0 1 0 0 0 0
 */