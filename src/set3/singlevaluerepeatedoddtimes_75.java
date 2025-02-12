package set3;

import java.util.Scanner;

public class singlevaluerepeatedoddtimes_75
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int xor=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            xor^=arr[i];
        }
        System.out.println(xor==0?"No odd occurence":xor);
    }
}
/*
Test Case 1:
5
3 2 4 2 3
Output:
4
Test Case 2:
5
7 7 7 7 7
Output:
7
Test Case 3:
6
2 3 3 5 5 2
Output:
0
 */