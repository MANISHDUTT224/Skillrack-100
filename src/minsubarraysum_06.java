import java.util.Scanner;

public class minsubarraysum_06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int cursum=arr[0],minsum=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            cursum=Math.min(cursum+arr[i],arr[i]);
            if(cursum<minsum){
                minsum=cursum;
            }
        }
        System.out.println(minsum);
    }
}

