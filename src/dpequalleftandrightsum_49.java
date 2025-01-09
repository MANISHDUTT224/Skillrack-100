import java.util.Scanner;

public class dpequalleftandrightsum_49 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        int su=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            su+=arr[i];
        }
        rightsum[0]=su-arr[0];
        for(int i=1;i<n;i++){
            leftsum[i]=leftsum[i-1]+arr[i];
            rightsum[i]=rightsum[i-1]-arr[i];
        }
        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i]){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
