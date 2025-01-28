package set1;

import java.util.Scanner;

public class majorityelement_15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int [n];
        int count=0,count1=0,ele=arr[0];
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
                count++;
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        if(count1>(n/2)){
            System.out.println(ele);
        }
    }
}
