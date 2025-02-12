package set3;

import java.util.Scanner;

public class primsalgo_73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        boolean visited[]=new boolean[n+1];
        int mat[][]=new int[n+1][n+1];
        for(int city=1;city<=n;city++){
            for(int other=1;other<=n;other++) {
                mat[city][other]=-1;
            }
        }
        int mincost=Integer.MAX_VALUE,mincostsrc=0,mincostdest=0;
        for(int i=1;i<=r;i++) {
            int src=s.nextInt();
            int dest=s.nextInt();
            int dist=s.nextInt();
            mat[src][dest]=mat[dest][src]=dist;
            if(dist<mincost) {
                mincost=dist;
                mincostsrc=src;
                mincostdest=dest;
            }
        }
        visited[mincostsrc]=visited[mincostdest]=true;
        int totalmincost=mincost;
        int remcities=n-2;
        while(remcities>0){
             mincost=Integer.MAX_VALUE;

             for(int city=1;city<=n;city++) {
                 if(visited[city]){
                     for(int other=1;other<=n;other++) {
                     if(city==other||visited[other]||mat[city][other]==-1) {
                         continue;
                     }

                         if(mincost>mat[city][other]) {
                          mincostdest=other;
                         mincost=mat[city][other];
                         }


                 }
                 }

             }
             totalmincost+=mincost;
             remcities--;
             visited[mincostdest]=true;
        }
        System.out.println(totalmincost);

    }
}
    /*
 Test Case 1:
 7 9
1 2 26
2 3 15
4 3 10
2 7 12
5 6 23
5 4 20
7 4 16
1 6 8
5 7 22
Output:
88
Test Case 2:
4 5
1 2 5
4 2 2
1 4 6
3 2 3
4 3 8
Output:
10
     */

