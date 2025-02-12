package set3;

import java.util.Arrays;
import java.util.Scanner;

public class browsingcentercomputers_66 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int startime[]=new int[n];
        int endtime[]=new int[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            String []input=s.nextLine().split("\\s+");
            String []stime=input[0].split(":");
            String[]etime=input[1].split(":");
            startime[i]=Integer.parseInt(stime[0])*60+Integer.parseInt(stime[1]);
            endtime[i]=Integer.parseInt(etime[0])*60+Integer.parseInt(etime[1]);
        }
        int computers=1;
        Arrays.sort(startime);
        Arrays.sort(endtime);
        int stind=0,endind=0;
        while(stind<n && endind<n){
            if(endtime[endind]>startime[stind]){
                computers=Math.max(computers,stind-endind+1);
                stind++;
            }
            else{
                endind++;
            }
        }
        System.out.println(computers);
    }
}
/*
Test Case 1:
9
10:00 20:00
11:00 14:00
11:00 14:00
14:00 15:00
14:00 15:00
15:00 18:00
15:00 18:00
12:00 13:00
16:00 18:00
Output:
4
Test Case 2:
6
9:00 11:00
9:30 10:30
9:30 12:00
9:45 13:00
11:00 15:00
10:00 14:00
Output:
5
 */