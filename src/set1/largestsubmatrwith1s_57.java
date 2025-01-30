package set1;

import java.util.Scanner;

public class largestsubmatrwith1s_57 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]mat=new int[r][c];
        int [][]dp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
           dp[i][0]=mat[i][0];
        }
        for(int i=0;i<c;i++){
            dp[0][i]=mat[0][i];
        }
        int maxsubmatrsize=1;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(mat[i][j]==1){
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                maxsubmatrsize=Math.max(maxsubmatrsize,dp[i][j]);
                }

            }
        }
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }

        System.out.println(maxsubmatrsize);
    }
}

/*
Test Case 1:
7 6
1 1 0 1 1 1
1 1 0 1 1 1
0 0 0 1 1 1
0 0 0 0 0 0
0 0 0 0 0 0
1 1 0 0 1 1
1 1 0 0 1 1
Output:
3
Test Case 2:
7 5
1 1 1 0 1
1 1 0 1 0
0 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
0 0 0 0 0
Output:
4
 */
