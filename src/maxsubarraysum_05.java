import java.util.Scanner;

public class maxsubarraysum_05{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int cursum=arr[0],maxsum=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            cursum=Math.max(cursum+arr[i],arr[i]);
            if(cursum>maxsum){
                maxsum=cursum;
            }
        }
        System.out.println(maxsum);

    }
}

