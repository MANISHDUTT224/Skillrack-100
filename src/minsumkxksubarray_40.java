import java.util.Scanner;

public class minsumkxksubarray_40 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int mat[][]=new int[r][c];
        int dp[][]=new int[r][c+1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int k=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=1;j<=c;j++){
                dp[i][j]+=mat[i][j-1]+dp[i][j-1];

            }

        }
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<=r-k;i++){
            for(int j=0;j<=c-k;j++){
                int sum=0;
                for(int srow=i;srow<i+k;srow++){
                    sum+=dp[srow][j+k]-dp[srow][j];
                }
                minsum=Math.min(sum,minsum);
            }
        }
        System.out.println(minsum);
    }
}
