package set2;

import java.util.Scanner;

public class stockbuyandsellsingletime_41 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int minprice=arr[0],maxprofit=0;
        for(int i=1;i<n;i++){
            if(minprice>arr[i]){
                minprice=arr[i];
            }
            else{
                if(maxprofit<arr[i]-minprice){
                    maxprofit=arr[i]-minprice;
                }
            }
        }
        System.out.println(maxprofit);
    }

}

/*
Test Case 1:
7
50 100 40 60 70 50 80
Output:
50
 */
