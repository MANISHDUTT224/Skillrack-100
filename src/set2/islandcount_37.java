package set2;

import java.util.Scanner;
public class islandcount_37 {
    public static void traverse(int mat[][],int r,int c){
        int n=mat.length;
        int m=mat[0].length;
        if(r>=0 && r<n && c>=0 && c<m){
            if(mat[r][c]==0){
                return;
            }
            mat[r][c]=0;
            traverse(mat,r-1,c);//Top
            traverse(mat,r,c-1);//Left
            traverse(mat,r+1,c);//Bottom
            traverse(mat,r,c+1);//Right
            traverse(mat,r-1,c-1);//TopLeft
            traverse(mat,r-1,c+1);//TopRight
            traverse(mat,r+1,c-1);//BottomLeft
            traverse(mat,r+1,c+1);//BottomRight
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int islands=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1) {
                    islands++;
                    traverse(mat, i, j);
                }
            }
        }
        System.out.println(islands);
    }
}
/*Test case
4 5
1 1 0 0 0
1 1 0 1 1
0 0 0 0 0
1 0 1 0 1*/
 