import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Pair{
    int health,row,col;
    Pair(int health,int row,int col){
        this.health=health;
        this.row=row;
        this.col=col;
    }
}
public class safewalkthroughgrid_88 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int health=s.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }

      PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.health,a.health));

        if(matrix[0][0]==1){
            pq.add(new Pair(health-1,0,0));
        }
        else{
            pq.add(new Pair(health,0,0));
        }
        boolean[][]vis=new boolean[n][m];
        vis[0][0]=true;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int val=p.health;
            int row=p.row;
            int col=p.col;
            if(row==n-1 && col==m-1){
                if(val>=1){
                    System.out.println("YES");
                    return;
                }
            }
            int xdir[]={-1,0,1,0};
            int ydir[]={0,-1,0,1};
            for(int i=0;i<4;i++){
                int x=row+xdir[i];
                int y=col+ydir[i];
                if(x>=0 && y>=0 && x<n && y<m && !vis[x][y]){
                    if(matrix[x][y]==1){
                        pq.add(new Pair(val-1,x,y));
                    }
                    else{
                        pq.add(new Pair(val,x,y));
                    }
                    vis[x][y]=true;
                }
            }

        }
        System.out.println("No");
    }
}
/*
Test Case 1:
3 3 5
1 1 1
1 0 1
1 1 1
Output:
Yes
Test Case 2:
4 6 3
0 1 1 0 0 0
1 0 1 0 0 0
0 1 1 1 0 1
0 0 1 0 1 0
Output:
No
Test Case 3:
3 5 1
0 1 0 0 0
0 1 0 1 0
0 0 0 1 0
Output:
Yes
Test Case 4:
1 4 4
1 1 1 1
Output:
No
 */

