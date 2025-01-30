package set2;

import java.util.Scanner;


public class minswapstodescendingorder_46 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n+1];
        for(int i=n;i>=1;i--){
            arr[i]=s.nextInt();
        }
        int totalswaps=0;
        boolean []visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(arr[i]==i){
                continue;
            }
            if(visited[arr[i]]){
                continue;
            }
            int edges=0,ci=i;
            while(!visited[arr[ci]]){
                visited[arr[ci]]=true;
                edges++;
                ci=arr[ci];
            }
            totalswaps+=edges-1;
        }
        System.out.println(totalswaps);

    }
}
/*
Test Case 1:
5
1 4 2 3 5
Output:
2
Test Case 2:
6
6 5 4 3 2 1
Output:
3
Test Case 3:
8
4 3 2 1 8 7 6 5
Output:
4
*/