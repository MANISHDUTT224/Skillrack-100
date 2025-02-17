import java.util.Arrays;
import java.util.Scanner;

public class burstballoons_81{
public  static int solve(int[]balloons ,int left,int right,int [][]dp){
    if(left>right){
        return 0;
    }
    if(dp[left][right]!=-1){
        return dp[left][right];
    }
    int maxpts=Integer.MIN_VALUE;
    for(int i=left;i<=right;i++){
        int pts=(solve(balloons,left,i-1,dp)+solve(balloons,i+1,right,dp)+(balloons[left-1]*balloons[i]*balloons[right+1]));
        maxpts=Math.max(maxpts,pts);
    }
    dp[left][right]=maxpts;
    return dp[left][right];
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []balloons=new int[n+2];
        balloons[0]=balloons[n+1]=1;
        for(int i=1;i<=n;i++){
            balloons[i]=s.nextInt();
        }
        int dp[][]=new int[n+2][n+2];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(solve(balloons,1,n,dp));
    }
}
/*
Test Case 1:
4
3 1 5 8
Output:
167
Test Case 2:
2
1 5
Output:
10
 */