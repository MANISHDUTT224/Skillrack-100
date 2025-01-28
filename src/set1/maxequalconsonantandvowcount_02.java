package set1;

import java.util.Scanner;

public class maxequalconsonantandvowcount_02 {
     public static boolean isvow(char c){
        return c=='a' || c=='e' || c=='i' ||c=='o'||c=='u';
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int k=s.nextInt();
        int n=str.length();
        int consonantcount=0;
        int vowcount=0,equalcount=0;
        for(int i=0;i<k;i++){
            if(!isvow(str.charAt(i))){
                consonantcount++;
            }
            else{
                vowcount++;
            }
        }
        if(consonantcount==vowcount){
            equalcount++;
        }
        for(int i=1;i<=n-k;i++){
            if(!isvow(str.charAt(i-1))){
                consonantcount--;
            }
            else{
                vowcount--;
            }
            if(!isvow(str.charAt(i+(k-1)))){
                consonantcount++;
            }
            else{
                vowcount++;
            }
            if(vowcount==consonantcount){
                equalcount++;
            }
        }
        System.out.println(equalcount);
    }
}
