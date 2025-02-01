import java.util.Scanner;

public class minjumpstoreachend_65{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int jumps=1,maxreachindex=arr[0],steps=arr[0];
        for(int ind=1;ind<n;ind++){
            if(ind==n-1){
                break;
            }
            maxreachindex=Math.max(maxreachindex,ind+arr[ind]);
            steps--;
            if(steps==0){
                jumps++;
                steps=maxreachindex-ind;
            }

        }
        System.out.println(jumps);
    }
}
/*
Test Case 1:
1
Output:
0
Test Case 2:
5
2 3 1 1 4
Output:
2
Test Case 3:
14
1 3 5 3 3 1 1 1 1 1 1 1 1 4
Output:
9
 */