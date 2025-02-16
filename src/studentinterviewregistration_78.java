import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class studentinterviewregistration_78 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int start=s.nextInt();
        int end=s.nextInt();
        List<int[]> intervals=new ArrayList<>();
        for(int i=0;i<n;i++){
            int st=s.nextInt();
            int en=s.nextInt();
            if(st<end && en>start){
                intervals.add(new int[]{Math.max(start,st),Math.min(end,en)});
            }

        }
      intervals.sort((a,b)->Integer.compare(a[1],b[1]));
        int last_end_time=start,count=0;
        for(int[]interval:intervals){
            if(interval[0]>=last_end_time){
                count++;
                last_end_time=interval[1];
            }
        }
        System.out.println(count);
    }
}
/*
Test Case 1:
9 11 50
30 32
4 6
26 28
21 25
2 3
11 15
11 25
40 42
48 50
Output:
6

Test Case 2:
10 1 20
1 2
3 4
1 4
5 6
9 10
5 7
8 12
6 7
11 14
15 20
Output:
7...But correct output-6
 */
