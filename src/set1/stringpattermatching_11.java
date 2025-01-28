package set1;

import java.util.*;
public class stringpattermatching_11 {
    public static void main(String[] args) {
        String string,pattern;
        Scanner s=new Scanner(System.in);
        string=s.nextLine();
        pattern=s.nextLine();
        int n=pattern.length();
        int []lps=new int[n];
        lps[0]=0;
        int len=0;
        int i=1;
       while(i<n){
            if(pattern.charAt(i)==pattern.charAt(len)){
                lps[i]=len+1;
                len++;
                i++;
            }
            else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }
       int si=0,ki=0,count=0;
       while(si<string.length() && ki<pattern.length()){
           if(pattern.charAt(ki)==string.charAt(si)){
               si++;
               ki++;
               if(ki==pattern.length()){
                   count++;
                   ki=0;
               }
           }
           else{
               if(ki==0){
                   si++;
               }
               else{
                   ki=lps[ki-1];
               }
           }
       }
        System.out.println(count);


    }
}