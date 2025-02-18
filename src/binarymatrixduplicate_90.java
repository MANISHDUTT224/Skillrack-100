import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class binarymatrixduplicate_90 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int power=m-1;
        int printed=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    sum+=Math.pow(2,power);
                }
                power--;
            }
            if(st.contains(sum)){
                System.out.print(i+1+" ");
                printed=1;
            }
            else{
                st.add(sum);
            }
            power=m-1;
        }
        if(printed==0){
            System.out.println(-1);
        }
    }
}
/*
Test Case 1:
4 3
1 0 1
0 1 0
1 0 1
1 1 1
Output:
3
Test Case 2:
3 3
1 0 0
0 1 1
1 1 0
Output:
-1
Test Case 3:
5 4
1 0 1 1
0 1 0 0
1 0 1 1
0 0 1 1
0 1 0 0
Output:
3 5
 */
