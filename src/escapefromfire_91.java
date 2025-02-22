import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
class Pair1{
    int x,y;
    Pair1(int x,int y){
        this.x=x;
        this.y=y;
    }
}
//public class escapefromfire_91{


public class escapefromfire_91{
        public static int manwalk(int [][]grid,int n,int m,int [][]dir){
        Queue<Pair1>q=new ArrayDeque<>();
        int visited[][]=new int[n][m];
        for(int arr[]:visited){
            Arrays.fill(arr,6000);
        }
        q.add(new Pair1(0,0));
        int time_man=3;
        visited[0][0]=time_man;
        while(!q.isEmpty()){
            int size= q.size();
            time_man++;
            for(int i=0;i<size;i++){
                Pair1 p=q.poll();
                int x=p.x;
                int y=p.y;

                for(int j=0;j<4;j++){
                    int row=x+dir[j][0];
                    int col=y+dir[j][1];
                    if(row>=0 && col>=0 && row<n && col<m && grid[row][col]!=2 && visited[row][col]==6000){
                        q.add(new Pair1(row,col));
                         visited[row][col]=time_man;
                    }
                }
            }
        }
        if(visited[n-1][m-1]==6000){
            return -1;
        }
        if(grid[n-1][m-1]==0){
            return 1000000000;
        }
        int diff=grid[n-1][m-1]-visited[n-1][m-1];
        if(diff<0){
            return -1;
        }
        boolean firetop=(grid[n-1][m-1]-grid[n-2][m-1]==1);
        boolean fireleft=(grid[n-1][m-1]-grid[n-1][m-2]==1);
        boolean mantop=(visited[n-1][m-1]-visited[n-2][m-1]==1);
        boolean manleft=(visited[n-1][m-1]-visited[n-1][m-2]==1);
        if(fireleft && firetop){
            return diff-1;
        }
        if(manleft && mantop){
            return diff;
        }
        else if((firetop && mantop)||(fireleft && manleft)){
            return diff-1;
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int grid[][]=new int[n][m];
        Queue<Pair1>q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=s.nextInt();
                if(grid[i][j]==1){
                    q.add(new Pair1(i,j));
                }
            }
        }
        int time=3;
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        while(!q.isEmpty()){

            int size=q.size();
            for(int i=0;i<size;i++){
                Pair1 p=q.poll();
            int x=p.x;
            int y=p.y;
            grid[x][y]=time;
            for(int j=0;j<4;j++){
                int row=x+dir[j][0];
                int col=y+dir[j][1];
                if(row>=0 && col>=0 && row<n && col<m && grid[row][col]==0){
                    q.add(new Pair1(row,col));
                }
            }
            }
            time++;
        }
        System.out.println(manwalk(grid,n,m,dir));
    }
}

/*
Test Case 1:
3 4
0 0 0 0
0 1 2 0
0 2 0 0
Output:
-1
Test Case 2:
5 7
0 2 0 0 0 0 0
0 0 0 2 2 1 0
0 2 0 0 1 2 0
0 0 2 2 2 0 2
0 0 0 0 0 0 0
Output:
3
Test Case 3:
3 3
0 0 0
2 2 0
1 2 0
Output:
1000000000
 */
