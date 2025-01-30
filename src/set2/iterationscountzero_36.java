package set2;

import java.util.Scanner;
public class iterationscountzero_36 {
    public static void traverse(int mat[][],int i,int j){
        int n=mat.length;
        int m=mat[0].length;
        if(i>=0 && i<n && j>=0 && j<m){
            if(mat[i][j]==0){
            return;
        }
        mat[i][j]=0;
            traverse(mat,i+1,j);
            traverse(mat,i-1,j);
            traverse(mat,i,j-1);
            traverse(mat,i,j+1);
        }
    }
    public static void main(String[] args) {
        int r,c;
        int iterations=0;

        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        c=s.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int k=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==k) {
                    iterations++;
                    traverse(mat, i, j);
                }
            }
        }
        System.out.println(iterations);
    }
}
