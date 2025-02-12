package set3;

import java.util.*;

public class streetravelcount_52 {
    public static List<Integer> getrelnodes(int node,int n,boolean[]visited,int [][]grid){
        int noderow=node/n,nodecol=node%n;
        List<Integer>nodes=new ArrayList<>();
        for(int i=nodecol-1;i>=0;i--){
            if(grid[noderow][i]==1){
                nodes.add(noderow*n+i);
            }
            else{
                break;
            }
        }
        for(int i=nodecol+1;i<n;i++){
            if(grid[noderow][i]==1){
                nodes.add(noderow*n+i);
            }
            else{
                break;
            }
        }
        for(int i=noderow-1;i>=0;i--){
            if(grid[i][nodecol]==1){
                nodes.add(i*n+nodecol);
            }
            else{
                break;
            }
        }
        for(int i=noderow+1;i<n;i++){
            if(grid[i][nodecol]==1){
                nodes.add(i*n+nodecol);
            }
            else{
                break;
            }
        }
        return nodes;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [][]grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=s.nextInt();
            }
        }
        int source=s.nextInt()*n+s.nextInt();
        int dest=s.nextInt()*n+s.nextInt();
        boolean []visited=new boolean[n*n];
        int []streets=new int[n*n];
        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int node=q.poll();
            List<Integer>l=getrelnodes(node,n,visited,grid);
            for(int adj:l){
                if(!visited[adj]){
                    visited[adj]=true;
                    streets[adj]=1+streets[node];
                    q.add(adj);
                }
                if(adj==dest){

                    System.out.println(streets[adj]);
                    return;
                }
            }
        }
        System.out.println(streets[dest]);
    }
}
/*
Test Case 1:
3
1 0 1
1 0 1
1 1 1
0 0
0 2
Output:
3

 */
