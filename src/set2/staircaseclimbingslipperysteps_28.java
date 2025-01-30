package set2;

import java.util.ArrayList;
import java.util.Scanner;

public class staircaseclimbingslipperysteps_28 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int l=s.nextInt();
     int sl=s.nextInt();
     int leaps[]=new int[l];
     for(int i=0;i<l;i++){
         leaps[i]=s.nextInt();
     }
        ArrayList<Integer>slips=new ArrayList<>();
     for(int i=0;i<sl;i++){
         slips.add(s.nextInt());
     }
     long ways[]=new long [n+1];
     ways[0]=1;
     for(int step=1;step<=n;step++){
         for(int i=0;i<l;i++){
             if(step>=leaps[i]){
                 ways[i]+=ways[step-leaps[i]];
             }
         }
         if(slips.contains(step)){
             int lastnonslippery=step-1;
             while(lastnonslippery>0 && slips.contains(lastnonslippery)){
                 lastnonslippery--;
             }
             ways[lastnonslippery]+=ways[step];
             ways[step]=0;
         }
     }
        System.out.println(ways[n]);

    }
}
