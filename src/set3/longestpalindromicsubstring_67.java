package set3;

import java.util.Scanner;

public class longestpalindromicsubstring_67 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        int maxlen=1;
       boolean palcheck[][]= new boolean[n][n];
       for(int i=0;i<n;i++){
           palcheck[i][i]=true;
       }
       for(int i=0;i<n-1;i++){
           if(str.charAt(i)==str.charAt(i+1)){
                 palcheck[i][i+1]=true;
                 maxlen=2;
           }

       }
       for(int len =3;len<n;len++){
           for(int i=0;i<=n-len;i++){
               if(str.charAt(i)==str.charAt(i+len-1) && palcheck[i+1][i+len-2]){
                   palcheck[i][i+len-1]=true;
                   maxlen=Math.max(maxlen,len);
               }
           }
       }
        System.out.println(maxlen);
    }
}
/*
Test Case 1:
evening
Output:
3
Test Case 2:
banana
Output:
5
Test Case 3:
abbaccccccccc
Output:
9
 */