import java.util.Scanner;

import static java.lang.Math.max;

public class sellingwinebottles_51 {
   public static int maxrevenue(int[]prices,int max[][],int left,int right,int year){
       if(left==right){
           return prices[left]*year;
       }
       if(max[left][right]!=0){
           return max[left][right];
       }
       int leftrevenue=prices[left]*year+maxrevenue(prices,max,left+1,right,year+1);
       int rightrevenue=prices[right]*year+maxrevenue(prices,max,left,right-1,year+1);
       max[left][right]=Math.max(leftrevenue,rightrevenue);
       return max[left][right];

   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prices[]=new int[n];
        int max[][]=new int[n][n];
        for(int i=0;i<n;i++){
            prices[i]=s.nextInt();
        }
        System.out.println(maxrevenue(prices,max,0,n-1,1));
    }
}
/*
Test Case 1:
4
2 4 6 2
Output:
42
Test Case 2:
5
3 5 7 3 6
Output:
79
 */
