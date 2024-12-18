import java.util.Scanner;

public class charinnminusonevalues_20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String [] arr=new String[n];
       int[] count=new int[26];
       for(int i=0;i<n;i++) {
           arr[i] = s.next();
           int curcount[]=new int[26];
           for(int j=0;j<arr[i].length();j++){
               if(curcount[arr[i].charAt(j)-'a']==0 && count[arr[i].charAt(j)-'a']==i){
                   curcount[arr[i].charAt(j)-'a']++;
                   count[arr[i].charAt(j)-'a']++;
               }
           }
       }
        String res = "";
        for (int i = 0; i < 26; i++) {
            if (count[i] >= n-1) {
                res+=(char)(i+97);
            }
        }
        System.out.println(res);
    }
}
