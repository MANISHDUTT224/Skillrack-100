import java.util.Scanner;

public class mincandydistributiontochildren_86 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
       int i=1;
        int total=n;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                i++;
            }
            int peak=0,valley=0;
            while(i<n && arr[i]>arr[i-1]){
                peak++;
                total+=peak;
                i++;
            }
            while(i<n && arr[i]<arr[i-1]){
                valley++;
                total+=valley;
                i++;
            }
            total-=Math.min(valley,peak);
        }
        System.out.println(total);
    }
}
/*
Test Case 1:
3
1 0 2
Output:
5
Test Case 2:
3
1 2 2
Output:
4
 */