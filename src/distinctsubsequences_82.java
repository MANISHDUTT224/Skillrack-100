import java.util.Arrays;
import java.util.Scanner;

public class distinctsubsequences_82 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        String str=s.nextLine();
        int n=t.length();

        int m=str.length();
        int dp[]=new int[m+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=m;j>=1;j--){
                if(str.charAt(j-1)==t.charAt(i-1)){
                    dp[j]+=dp[j-1];
                }
            }
        }
        System.out.println(dp[m]);
    }
}

/*
Test Case 1:
rabbbit
rabbit
Output:
3
Test Case 2:
babgbag
bag
Output:
5

 */