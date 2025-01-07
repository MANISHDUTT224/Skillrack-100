import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class largestpossibleoddinteger_43 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        int dp[]=new int[10];
        while(n>0){
            dp[(int)n%10]++;
            n/=10;
        }
        int ud=-1;
        for(int i=1;i<=9;i+=2){
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
        for(int i=9;i>=0;i--){
            while(dp[i]>0){
                res+=i;
                dp[i]--;
            }
        }
        res+=ud;
        System.out.println(Long.parseLong(res));
    }
}
/*
Test Case 1:
7000000
Output:
7
Test Case 2:
9102938
Output:
9983201
Test Case 3:
2002000
Output:
no
 */
