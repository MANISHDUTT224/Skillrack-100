package set3;

import java.util.Scanner;

public class palindromicpartition_69 {
    public static int calcsplits(String str,int left,int right,Integer[][]splits,boolean[][]palcheck){
       int minsplits=str.length();
       if(palcheck[left][right]){
           return 0;
       }
       if(splits[left][right]!=null){
           return splits[left][right];
       }
       for(int i=left;i<right;i++){
           int cursplits=1+calcsplits(str,left,i,splits,palcheck)+calcsplits(str,i+1,right,splits,palcheck);
           minsplits=Math.min(cursplits,minsplits);
       }
       splits[left][right]=minsplits;
       return minsplits;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        boolean[][]palcheck=new boolean[n][n];
        for(int i=0;i<n;i++){
            palcheck[i][i]=true;
        }
        int maxlen=1;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                palcheck[i][i+1]=true;
                maxlen=2;
            }
        }
        for(int len=3;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                if(str.charAt(i)==str.charAt(i+len-1) && palcheck[i+1][i+len-2]){
                    palcheck[i][i+len-1]=true;
                    maxlen=Math.max(maxlen,len);
                }
            }
        }
        Integer[][]splits=new Integer[n][n];
        System.out.println(calcsplits(str,0,n-1,splits,palcheck));

    }
}
/*
Test Case 1:
evening
Output:
2
Test Case 2:
level
Output:
0
Test Case 3:
abcd
Output:
3
Test Case 4:
deer
Output:
2
 */