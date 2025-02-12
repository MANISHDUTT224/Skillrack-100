package set3;

import java.util.Scanner;

public class minjumpstoreachend_65{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1){
            System.out.println(0);
        }
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int maxreachind=arr[0],steps=arr[0],jumps=0;
        for(int i=1;i<n;i++){
            maxreachind=Math.max(maxreachind,i+arr[i]);
            steps--;
            if (steps==0){
                jumps++;
                steps=maxreachind-i;

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