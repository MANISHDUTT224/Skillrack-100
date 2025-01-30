import java.util.Scanner;

public class wildcardmatching_59 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String pat=s.nextLine();
        int r=str.length();
        int c=pat.length();
        int dp[][]=new int[r+1][c+1];
        dp[0][0]=1;
        if(pat.charAt(0)=='*'){
            dp[0][1]=1;
        }

        for(int i=1;i<=r;i++) {
            for(int j=1;j<=c;j++){
                if(pat.charAt(j-1)=='?' || pat.charAt(j-1)==str.charAt(i-1)){
                    if(dp[i-1][j-1]==1){
                        dp[i][j]=1;
                    }
                }
                else if(pat.charAt(j-1)=='*'){
                    if(dp[i-1][j]==1||dp[i][j-1]==1){
                        dp[i][j]=1;
                    }
                }
//                else if(pat.charAt(j-1)==str.charAt(i-1)){
//                    if(dp[i-1][j-1]==1){
//                        dp[i][j]=1;
//                    }
//                }
            }
        }
        System.out.println((dp[r][c]==1?"Matching":"Not matching"));
    }
}
/*
Test Case 1:
abbcddeff
?b?c?d?*
Output:
Matching
Test Case 2:
abbbbbbbbccbhd
*b??b?d***
Output:
Matching

 */