import java.util.Scanner;

public  class bottomleftopright_04{
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
        dp[row-1][0]=mat[row-1][0];
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<col;j++){
                if(i==row-1 && j==0){
                    continue;
                }
                else if(i==row-1){
                    dp[i][j]=dp[i][j-1];
                }
                else if(j==0){
                    dp[i][j]=dp[i+1][j];
                }
                else{
                    dp[i][j]=dp[i][j-1]+dp[i+1][j];
                }
            }
        }
        if(dp[0][col-1]>0){
            System.out.println("yes "+dp[0][col-1]);
        }
        else{
            System.out.println("no");
        }
    }

}