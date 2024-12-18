import java.util.Scanner;

public class collectmaxfromgivencell_24{
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
        int x=s.nextInt();
        int y=s.nextInt();
        dp[0][0]=mat[0][0];
        for(int i=x+1;i<rows;i++){
            dp[i][y]=mat[i][y]+dp[i-1][y];
        }
        for(int j=y+1;j<cols;j++){
            dp[x][j]=mat[x][j]+dp[x][j-1];
        }
        for(int i=x+1;i<rows;i++){
            for(int j=y+1;j<cols;j++){
                dp[i][j]=mat[i][j]+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[rows-1][cols-1]);
    }
}
