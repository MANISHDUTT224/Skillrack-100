package set3;

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
        boolean[][]subsetdp=new boolean[n+1][totalsum+1];
        for(int i=1;i<=n;i++){
            int cursum=arr[i-1];
            for(int csum=0;csum<=totalsum;csum++){
                if(csum>=cursum&&(csum==cursum||subsetdp[i-1][csum-cursum])){
                    subsetdp[i][csum]=true;
                }
                else{
                    subsetdp[i][csum]=subsetdp[i-1][csum];
                }
            }
        }
        int counter=0;
        for(int i=2;i<=totalsum;i+=2){
            if(subsetdp[n][i]){
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
