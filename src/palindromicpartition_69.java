import java.util.Scanner;

public class palindromicpartition_69 {
    public static int calcsplits(String str,int start,int end,boolean[][]palcheck,Integer[][]splits){
        if(palcheck[start][end]){
            return 0;
        }
        if(splits[start][end]!=null){
            return splits[start][end];
        }
        int minsplits=str.length();
        for(int i=start;i<end;i++){
            int cursplits=1+calcsplits(str,start,i,palcheck,splits)+calcsplits(str,i+1,end,palcheck,splits);
            if(minsplits>cursplits){
                minsplits=cursplits;
            }

        }
        splits[start][end]=minsplits;
        return minsplits;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        boolean [][]palcheck=new boolean[n][n];
        for(int i=0;i<n;i++){
            palcheck[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                palcheck[i][i+1]=true;
            }
        }
        for(int len=3;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                if(str.charAt(i)==str.charAt(i+len-1) && palcheck[i+1][i+len-2]){
                    palcheck[i][i+len-1]=true;
                }
            }
        }
        Integer[][]splits=new Integer[n][n];
        System.out.println(calcsplits(str,0,n-1,palcheck,splits));
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