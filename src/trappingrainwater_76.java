import java.util.Scanner;

public class trappingrainwater_76 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int height[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=s.nextInt();
        }
      left[0]=height[0];
        right[n-1]=height[n-1];
        int totalmincost=0;
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            totalmincost+=Math.min(left[i],right[i])-height[i];
        }
        System.out.println(totalmincost);
    }
}
/*
Test Case 1:
12
0 1 0 2 1 0 1 3 2 1 2 1
Output:
6
Test Case 2:
6
4 2 0 3 2 5
Output:
9
 */