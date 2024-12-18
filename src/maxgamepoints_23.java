import java.util.*;
public class maxgamepoints_23{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rows,cols;
        rows=s.nextInt();
        cols=s.nextInt();
        int mat[][]=new int[rows][cols];
        int dp[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=s.nextInt();
            }
        }
        dp[0][0]=mat[0][0];
        for(int i=1;i<rows;i++){
            dp[i][0]=mat[i-1][0]+dp[i][0];
        }
        for(int j=1;j<cols;j++){
            dp[0][j]=mat[0][j-1]+dp[0][j];
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                dp[i][j]=mat[i][j]+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[rows-1][cols-1]);
    }
}
