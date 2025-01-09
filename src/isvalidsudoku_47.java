import java.util.Scanner;

public class isvalidsudoku_47 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int digit;
        int row[]=new int[9];
        int col[]=new int[9];
        int submatr[]=new int[9];
        for(int i=0;i<9;i++){
            row[i]=col[i]=submatr[i]=1;
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                digit=s.nextInt();
                row[i]|=1<<digit;
                col[j]|=1<<digit;
                submatr[((i/3)*3)+(j/3)]|=1<<digit;
            }
        }
        int value=(1<<10)-1;
        for(int i=0;i<9;i++){
            if(row[i]!=value||col[i]!=value||submatr[i]!=value){
                System.out.println("INVALID");
                return;
            }
        }
        System.out.println("VALID");
    }
}
/*
Test Case 1:
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
Output:
VALID
Test Case 2:
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 2
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
Output:
VALID
Test Case 3:
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
Output:
INVALID

 */