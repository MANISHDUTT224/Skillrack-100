import java.util.Scanner;

public class stockbuyandsellmultipletime_42 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int maxprofit=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                maxprofit+=arr[i]-arr[i-1];
            }
        }
        System.out.println(maxprofit);
    }
}

/*
Test Case 1:
6
7 1 5 3 6 4
Output:
7
5
1 2 3 4 5
Output:
4
Test Case 3:
5
7 6 4 3 1
Output:
0
 */