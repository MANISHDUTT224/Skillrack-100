import java.util.Arrays;
import java.util.Scanner;

public class coinchange_77 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int amount=s.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=s.nextInt();
        }
       int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int coin:coins){
            for(int j=coin;j<=amount;j++){
                dp[j]=Math.min(dp[j],dp[j-coin]+1);
            }
        }
        if(dp[amount]==amount+1){
            System.out.println(-1);
            return;
        }
        System.out.println(dp[amount]);
    }
}
/*
Test Case 1:
3 11
1 2 5
Output:
3
Test Case 2:
1 3
2
Output:
-1
Test Case 3:
1 0
1
Output:
0
 */