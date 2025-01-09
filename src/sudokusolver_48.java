import java.util.Scanner;

public class sudokusolver_48 {
    static int n=9;
    public static boolean isValid(int board[][],int digit,int r,int c){
        for(int i=0;i<9;i++){
            if(board[i][c]==digit||board[r][i]==digit||board[3*(r/3)+(i/3)][3*(c/3)+(i%3)]==digit){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(int board[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    for(int digit=1;digit<=9;digit++){
                        if(isValid(board,digit,i,j)){
                            board[i][j]=digit;
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=s.nextInt();
            }
        }
        if(solve(mat)){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Not Solved");
        }
    }
}
/*
Test Case 1:
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 5
Output:
Not Solved
Test Case 2:
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
Output:
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
Test Case 3:
0 0 0 0 0 0 0 1 0
4 0 0 0 0 0 0 0 0
0 2 0 0 0 0 0 0 0
0 0 0 0 5 0 4 0 7
0 0 8 0 0 0 3 0 0
5 0 7 0 0 9 0 0 0
0 0 0 0 0 0 0 8 0
0 0 0 0 0 0 0 0 6
0 6 0 0 0 0 0 0 0
Output:
3 5 6 2 4 7 8 1 9
4 7 1 3 9 8 2 6 5
8 2 9 1 6 5 7 3 4
6 1 2 8 5 3 4 9 7
9 4 8 6 7 2 3 5 1
5 3 7 4 1 9 6 2 8
1 9 4 7 2 6 5 8 3
2 8 5 9 3 4 1 7 6
7 6 3 5 8 1 9 4 2
 */