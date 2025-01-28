import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class coronaviruspread_53 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int mat[][]=new int[r][c];
        int healthy=0,days=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
                if(mat[i][j]==1){
                    healthy++;
                }
                if(mat[i][j]==2){
                    q.add(i*c+j);
                }
            }
        }
        q.add(-1);
        while(!q.isEmpty()){
            int node=q.poll();

            if(node==-1){
                if(!q.isEmpty()){
                    q.add(-1);
                    days++;
                }
                continue;
            }
             int noderow=node/c,nodecol=node%c;
            if(noderow!=0 && mat[noderow-1][nodecol]==1){
                mat[noderow-1][nodecol]=2;
                healthy--;
                q.add((noderow-1)*c+nodecol);
            }
             if(noderow!=r-1 && mat[noderow+1][nodecol]==1){
                mat[noderow+1][nodecol]=2;
                healthy--;
                q.add((noderow+1)*c+nodecol);
            }
              if(nodecol!=0 && mat[noderow][nodecol-1]==1){
                mat[noderow][nodecol-1]=2;
                healthy--;
                q.add((noderow)*c+nodecol-1);
            }
               if(nodecol!=c-1 && mat[noderow][nodecol+1]==1){
                mat[noderow][nodecol+1]=2;
                healthy--;
                q.add((noderow)*c+nodecol+1);
            }

        }
        System.out.println((healthy==0)?days:-1);
    }
}
/*
Test Case 1:
3 3
1 1 0
1 2 1
0 1 1
Output:
2
Test Case 2:
3 3
1 1 0
0 0 1
0 1 1
Output:
-1
Test Case 3:
4 4
2 1 1 2
1 0 0 1
1 0 0 1
2 1 1 2
Output:
1
 */