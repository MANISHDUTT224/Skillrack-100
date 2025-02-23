import java.util.Scanner;

public class splitarrayintokpartslargestsum_95 {
    public static boolean possible(int arr[],int n,int k,int mid){
        int sum=0,cnt=1;
        for(int i=0;i<n;i++){
            if(arr[i]>mid){
                return false;
            }
            if(arr[i]+sum>mid){
                cnt++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return cnt<=k;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        int low=0,high=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            high+=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,n,k,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
}
/*
Test Case 1:
5 2
7 2 5 10 8
Output:
18
Test Case 2:
5 2
1 2 3 4 5
Output:
9
 */