import java.util.Arrays;
import java.util.Scanner;

public class maxcoinsbottomrowcannotpick_60 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while ((n--)>0){
            int r=s.nextInt();
            int c=s.nextInt();
            int mat[][]=new int[r][c];
            int dp[][]=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    mat[i][j]=s.nextInt();
                }
            }
            for(int i=0;i<c;i++){
                dp[0][i]=mat[0][i];
            }
            for(int i=1;i<r;i++){
                int []prevrow= Arrays.copyOf(dp[i-1],c);
                Arrays.sort(prevrow);
                int firstmax=prevrow[c-1];
                int secondmax=prevrow[c-2];
                for(int j=0;j<c;j++){
                    if(dp[i-1][j]!=firstmax){
                        dp[i][j]=firstmax+mat[i][j];
                    }
                    else{
                        dp[i][j]=secondmax+mat[i][j];
                    }
                }

            }
            Arrays.sort(dp[r-1]);
            System.out.println(dp[r-1][c-1]);
        }

    }
}
/*
2
5 5
25 98 74 11 89
53 68 36 48 23
4 19 99 48 41
40 22 97 72 1
29 67 61 92 49

10 2
55 57
87 32
93 28
26 9
13 87
44 63
84 97
26 63
60 91
41 97
Output:
395
584
 */