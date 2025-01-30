package set2;

import java.util.Scanner;

public class combinationsumzero_32 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0,sum;
        for(int ctr=1;ctr<(1<<n);ctr++){
            sum=0;
            for(int i=0;i<n;i++){
                if((ctr&(1<<i))!=0){
                    sum+=arr[i];
                }
            }
            if(sum==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

