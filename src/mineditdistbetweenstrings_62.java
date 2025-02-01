import java.util.Scanner;

public class mineditdistbetweenstrings_62 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)!=s2.charAt(j-1)){
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
                else{
                    dp[i][j]=dp[i-1][j-1];
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
/*
Test Case 1:
hello
hail
Output:
3
Test Case 2:
intrusive
intrinsic
Output:
4
 */