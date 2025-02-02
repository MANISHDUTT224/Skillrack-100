import java.util.Scanner;

public class primsalgo_73 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int mat[][]=new int[n+1][n+1];
        int visited[]=new int[n+1];
        int src,des,cost;
        int mincost=Integer.MAX_VALUE;
        int mincostsrc=0,mincostdest=0;
        for(int city=1;city<=n;city++){
            for(int other=1;other<=n;other++){
                mat[city][other]=-1;
            }
        }
        for(int i=1;i<=r;i++){
            src=s.nextInt();
            des=s.nextInt();
            cost=s.nextInt();
            mat[src][des]=mat[des][src]=cost;
            if(cost<mincost){
                mincost=cost;
                mincostsrc=src;
                mincostdest=des;
            }
        }
        visited[mincostsrc]=visited[mincostdest]=1;
        int totalmincost=mincost;
        int remcities=n-2;
        while(remcities>0){
            mincost=Integer.MAX_VALUE;
            for(int city=1;city<=n;city++){
                if(visited[city]==1){
                    for(int other=1;other<=n;other++){
                        if(other==city || visited[other]==1||mat[city][other]==-1){
                            continue;
                        }
                        if(mat[city][other]<mincost){
                            mincost=mat[city][other];
                            mincostdest=other;
                        }
                    }
                }
            }
            totalmincost+=mincost;
            visited[mincostdest]=1;
            remcities--;
        }
        System.out.println(totalmincost);
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
}
