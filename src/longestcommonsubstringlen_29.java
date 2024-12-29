import java.util.ArrayList;
import java.util.Scanner;

public class longestcommonsubstringlen_29{
    public static void main(String[] args) {
        String s1,s2;

        Scanner s=new Scanner(System.in);
        s1=s.nextLine();
        s2=s.nextLine();
        int n= s1.length();
        int m=s2.length();
        int longest=0;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    if(i-1>=0 && j-1>=0){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j]=1;
                    }
                }
                longest=Math.max(longest,dp[i][j]);
            }
        }
        System.out.println("Longest common substring length : "+longest);


    }
}
