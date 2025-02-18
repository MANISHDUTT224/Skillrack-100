import java.util.Arrays;
import java.util.Scanner;

public class wordbreak_87 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();

        int m=s.nextInt();
        s.nextLine();
        String[]words=new String[m];
        for(int i=0;i<m;i++){
            words[i]=s.nextLine();
        }
        boolean dp[]=new boolean[n+1];
        Arrays.fill(dp,false);
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(String word:words){
                int start=i-word.length();
                if(start>=0 && dp[start] && str.substring(start,start+word.length()).equals(word)){
                    dp[i]=true;
                    break;
                }
            }
        }
        System.out.println((dp[n]==true?"Yes":"No"));
    }
}
/*
Test Case 1:
leetcode
2
leet
code
Output:
Yes
Test Case 2:
applepenapple
2
apple
pen
Output:
Yes
Test Case 3:
catsandog
5
cats
dog
sand
and
cat
Output:
No

 */
