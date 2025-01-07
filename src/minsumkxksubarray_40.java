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
        for(int i=0;i<r;i++){
            for(int j=0;j<=c;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<=r-k;i++){
            for(int j=0;j<=c-k;j++){
                int sum=0;
                for(int subrow=i;subrow<i+k;subrow++){
                    sum+=dp[subrow][j+k]-dp[subrow][j];
                }
                minsum=Math.max(minsum,sum);
            }
        }
        System.out.println(minsum);

    }
}



