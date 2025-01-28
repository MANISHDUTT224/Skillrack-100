package set1;

import java.util.Scanner;

public class topleftobottomright_03{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int mat[][]=new int[row][col];
        int dp[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=s.nextInt();
            }
        }
        dp[0][0]=mat[0][0];
         for(int i=0;i<row;i++) {
             for (int j = 0; j < col; j++) {
                 if (mat[i][j] == 1) {
                     if (i == 0 && j == 0) {
                         continue;
                     } else if (i == 0) {
                         dp[i][j] = dp[i][j - 1];
                     } else if (j == 0) {
                         dp[i][j] = dp[i - 1][j];
                     } else {
                         dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                     }
                 }
             }
         }
        if(dp[row-1][col-1]>0){
            System.out.println("yes "+dp[row-1][col-1]);
        }
        else{
            System.out.println("no");
        }
    }
}
