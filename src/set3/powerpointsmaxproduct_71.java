package set3;

import java.util.Scanner;

public class powerpointsmaxproduct_71 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int dp[]=new int[n+1];
       for(int i=1;i<=n;i++){
           for(int onepart=1;onepart<=i;onepart++){
               int rempart=i-onepart;
               rempart=(rempart<dp[rempart])?dp[rempart]:rempart;
               dp[i]=Math.max(dp[i],onepart*rempart);
           }
       }
        System.out.println(dp[n]);
    }
}
/*
Test Case 1:
5
Output:
6
Test Case 2:
7
Output:
12
Test Case 3:
10
Output:
36
 */