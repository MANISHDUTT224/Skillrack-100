import java.util.Arrays;
import java.util.Scanner;

public class leastimmeasurableweight_50 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int m=1;
        for(int i=0;i<n;i++){
            if(m>=arr[i]){
                m+=arr[i];
            }
        }
        System.out.println(m);
    }
}
/*
Test Case 1:
4
1 2 10 4
Output:
8
Test Case 2:
4
1 2 1 5
Output:
10
 */