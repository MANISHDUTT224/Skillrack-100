import java.util.Scanner;

public class wordsearchinmatrix_38 {
    static boolean found=false;
    public static void traverse(char mat[][],String word,int wordind,int i,int j){
        int n=mat.length;
        int m=mat[0].length;
        if(wordind==word.length()){
            found=true;
            return;
        }
        if(i>=0 && i<n && j>=0 && j<m){
            if(mat[i][j]!=word.charAt(wordind)){
                return;
            }
            char back=mat[i][j];
            mat[i][j]='-';
            traverse(mat,word,wordind+1,i+1,j);
            traverse(mat,word,wordind+1,i-1,j);
            traverse(mat,word,wordind+1,i,j+1);
            traverse(mat,word,wordind+1,i,j-1);
            mat[i][j]=back;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        char mat[][]=new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.next().charAt(0);
            }
        }
        s.nextLine();
        String word=s.nextLine();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==word.charAt(0)){
                    traverse(mat,word,0,i,j);
                    if(found){
                        System.out.println("yes");
                        return;
                    }

                }
            }
        }
        System.out.println("no");
    }
}
/*
Test Case 1
3 4
A B C E
S F C S
A D E E
SEE
Expected Output:
yes

Test Case 2
3 4
A B C E
S F C S
A D E E
ABCB
Expected Output:
no

Test Case 3
5 5
H E L L O
W O R L D
C R O P S
F A R M S
N O R T H
HELLO
Expected Output:
yes

Test Case 4
3 3
C A T
D O G
M O O
DOG
Expected Output:
yes

Test Case 5
3 4
C A T S
R A T E
D O G S
MICE
Expected Output:
no

Test Case 6
4 4
P A T H
M A R K
R E S T
P L A N
MARK
Expected Output:
yes
*/
