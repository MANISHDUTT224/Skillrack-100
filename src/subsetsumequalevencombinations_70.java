import java.util.Arrays;
import java.util.Scanner;

public class subsetsumequalevencombinations_70 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int totalsum=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            totalsum+=arr[i];
        }
        Arrays.sort(arr);
        boolean[][]subsetdp=new boolean[n+1][totalsum+1];
        for(int i=1;i<=n;i++){
            int currsum=arr[i-1];
            for(int sum=0;sum<=totalsum;sum++){
                if(sum>=currsum &&(sum==currsum |subsetdp[i-1][sum-currsum])){
                    subsetdp[i][sum]=true;
                }
                else{
                    subsetdp[i][sum]=subsetdp[i-1][sum];
                }
            }
        }
        int counter=0;
        for(int sum=2;sum<=totalsum;sum+=2){
            if(subsetdp[n][sum]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
/*
Test Case 1:
4
2 7 5 4
Output:
7
Test Case 2:
5
1 3 5 7 9
Output:
11


 */