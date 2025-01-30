package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class maxtollgateamount_58 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        int k=s.nextInt();
        ArrayList<Integer>tollgatedist=new ArrayList<>();
        int []tollfee=new int[k];
        int maxtolldist=0;
        for(int i=0;i<k;i++){
            tollgatedist.add(s.nextInt());
            maxtolldist=Math.max(tollgatedist.get(i),maxtolldist);
        }
        for(int i=0;i<k;i++){
            tollfee[i]=s.nextInt();
        }
        int dp[]=new int[n];
        int ind=0;
        int maxamt=0;
        for(int i=1;i<n;i++){
            if(i>maxtolldist){
                break;
            }
            if(tollgatedist.contains(i)){
                if(i<=d){
                    dp[i]=Math.max(dp[i-1],tollfee[ind++]);
                }
                else{
                    dp[i]=Math.max(dp[i-d-1]+tollfee[ind++],dp[i-1]);
                }
            }
            else{
                dp[i]=dp[i-1];
            }
            maxamt=Math.max(maxamt,dp[i]);
        }
        System.out.println(maxamt);
    }
}
/*
Test Case 1:
1000 40 7
10 20 60 120 150 180 200
19 9 33 46 15 31 56
Output:
154
Test Case 2:
200 40 5
60 70 120 130 180
50 70 50 30 20
Output:
140
 */