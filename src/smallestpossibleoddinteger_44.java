import java.util.HashMap;
import java.util.Scanner;

public class smallestpossibleoddinteger_44 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long dp[]=new long[10];
        int ud=-1;
        long div10=10L;
        while(n>0){
            dp[(int) (n%div10)]++;
            n/=10L;
        }
        for(int i=9;i>=1;i-=2){
            if(dp[i]>0){
                ud=i;
                dp[i]--;
                break;
            }

        }
        if(ud==-1){
            System.out.println("no");
            return;
        }
        String res="";
        for(int i=0;i<=9;i++){
            while(dp[i]>0){
                res+=String.valueOf(i);
                dp[i]--;
            }
        }
        res+=String.valueOf(ud);
        System.out.println(Long.parseLong(res));
    }
}
/*
Test Case 1:
9102938
Output:
123899

 */