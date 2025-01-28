package set1;

import java.util.Scanner;

public class socialmedialeader_25 {
    public static void main(String[] args) {
        int n,r;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        r=s.nextInt();
        int graph[][]=new int[r][2];
        int inedges[]=new int[n];
        int outedges[]=new int[n];
       for(int i=0;i<r;i++){
           graph[i][0]=s.nextInt();
           graph[i][1]=s.nextInt();
           outedges[graph[i][0]]++;
           inedges[graph[i][1]]++;
       }
       boolean found=false;
       for(int i=0;i<n;i++){
           if(outedges[i]==0 && inedges[i]==n-1){
               found=true;
               System.out.println(i+1);
               break;
           }
       }
       if(!found){
           System.out.println(-1);
       }

    }
}
