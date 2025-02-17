import java.util.Scanner;

public class longestincreasingpathinmatrix_85 {
    static short path[][];
    static int n,m;
    public static int dfs(int i,int j,short[][]path,int[][]mat){
        if(path[i][j]>0){
            return path[i][j];
        }
        if(path[i][j]==-1){
            return 0;
        }
        int n= mat.length;
        int m=mat[0].length;
        path[i][j]=-1;
        int max_state=0;
        if(i>0 && mat[i-1][j]>mat[i][j]){
            max_state=Math.max(max_state,dfs(i-1,j,path,mat));
        }
        if(j>0 && mat[i][j-1]>mat[i][j]){
            max_state=Math.max(max_state,dfs(i,j-1,path,mat));
        }
        if(i<n-1 && mat[i+1][j]>mat[i][j]){
            max_state=Math.max(max_state,dfs(i+1,j,path,mat));
        }
        if(j<m-1 && mat[i][j+1]>mat[i][j]){
            max_state=Math.max(max_state,dfs(i,j+1,path,mat));
        }
        path[i][j]=(short)(1+max_state);
        return path[i][j];
    }
    public static void main(String[] args) {
        int max_path=1;
        Scanner s=new Scanner(System.in);
         n=s.nextInt();
         m=s.nextInt();
        path=new short[200][200];
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max_path=Math.max(max_path,dfs(i,j,path,mat));
            }
        }
        System.out.println(max_path);
    }
}
/*
Test Case 1:
3 3
9 9 4
6 6 8
2 1 1
Output:
4
Test Case 2:
3 3
3 4 5
3 2 6
2 2 1
Output:
4
Test Case 3:
1 1
1
Output:
1


 */