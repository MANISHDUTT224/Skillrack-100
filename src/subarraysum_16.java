import java.util.Scanner;

public class subarraysum_16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int left=0,right=0;


        for(int i=0;i<n;i++){
         arr[i]=s.nextInt();
        }
        int sum=arr[0];
        int target=s.nextInt();
        boolean found=false;
        while(right<n){
            if(sum==target){
                System.out.println("YES");
                found=true;
                break;
            }
            else if(sum<target){
                right++;
                if(right<n){
                    sum+=arr[right];
                }
            }
            else{

                sum-=arr[left];
                left++;
            }
        }
        if(!found){
            System.out.println(sum);
        }

    }
}
