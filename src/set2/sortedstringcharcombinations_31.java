package set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortedstringcharcombinations_31 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        ArrayList<String>arr=new ArrayList<>();
        int n=s.length();
        arr.add(s);
       for(int ctr=1;ctr<Math.pow(2,n);ctr++){
           String temp="";
           for(int i=0;i<n;i++){
               if((ctr&(1<<i))==0){
                   temp+=s.charAt(i);
               }
           }
           arr.add(temp);
       }
       Collections.sort(arr);
       for(String st:arr){
           System.out.println(st);
       }
    }
}
