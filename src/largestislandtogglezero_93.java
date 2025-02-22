import java.util.*;

public class largestislandtogglezero_93 {
    public static int dfs(int grid[][],int i,int j,int n,int m,int islandid){
        if(i<0 || j<0 || i>=n ||j>=m || grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=islandid;
        return 1+dfs(grid,i-1,j,n,m,islandid)+dfs(grid,i+1,j,n,m,islandid)+dfs(grid,i,j-1,n,m,islandid)+dfs(grid,i,j+1,n,m,islandid);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int grid[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = s.nextInt();
            }
        }

        int islandid=2;
        Map<Integer,Integer> islandsizes=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    islandsizes.put(islandid,dfs(grid,i,j,n,m,islandid));
                    islandid++;
                }
            }
        }
        if(islandsizes.isEmpty()){
            System.out.println(1);
            return;
        }
        if(islandsizes.size()==1){
            if(islandid==3){
                System.out.println(n*m);
                return;
            }
            islandid--;
            System.out.println((islandsizes.get(islandid)==n*m)?islandsizes.get(islandid):islandsizes.get(islandid)+1);
        }
        int maxislandsize=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    Set<Integer>neighborislands=new HashSet<>();
                    int currentislandsize=1;
                    if(i-1>=0 && grid[i-1][j]>1){
                        neighborislands.add(grid[i-1][j]);
                    }
                    if(j-1>=0 && grid[i][j-1]>1){
                        neighborislands.add(grid[i][j-1]);
                    }
                    if(i+1<n && grid[i+1][j]>1){
                        neighborislands.add(grid[i+1][j]);
                    }
                    if(j+1<m && grid[i][j+1]>1){
                        neighborislands.add(grid[i][j+1]);
                    }
                    for(int id:neighborislands){
                        currentislandsize+=islandsizes.get(id);
                    }
                    maxislandsize=Math.max(maxislandsize,currentislandsize);
                }
            }
        }
        System.out.println(maxislandsize);
    }
}
/*
Test Case 1:
5 6
1 1 0 1 1 1
1 1 0 0 1 1
0 0 1 1 1 1
0 0 0 0 0 0
1 1 1 1 1 1
Output:
16
Test Case 2:
5 6
1 1 0 1 1 1
1 1 0 0 1 1
0 0 1 1 1 1
0 1 0 0 0 0
1 1 1 1 1 1
Output:
21
Test Case 3:
2 2
1 0
0 1
Output:
3
Test Case 4:
2 2
1 1
1 0
Output:
4
Test Case 5:
2 2
1 1
1 1
Output:
4

 */