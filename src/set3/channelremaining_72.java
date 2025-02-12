package set3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class channelremaining_72 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        List<Integer>channels=new ArrayList<>();
        for(int i=0;i<n;i++){
            channels.add(i+1);
        }
        int delindex=k-1;
        while(channels.size()>1){
            if(delindex>=channels.size()){
                delindex%=channels.size();

            }
            channels.remove(channels.get(delindex));
            delindex--;
            delindex+=k;
        }
        System.out.println(channels.get(0));
    }
}
/*
Test case 1:
5 2
Output:
3
Test Case 2:
10 7
Output:
9
 */