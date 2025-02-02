//Same as 33 but in c

import java.util.Scanner;

public class stringpermutation_74{
    public static void findcomb(String str,int l,int r){
        if(l==r){
            System.out.println(str);
            return ;
        }
        for(int i=l;i<=r;i++){
            str=swap(str,i,l);

            findcomb(str,l+1,r);
            str=swap(str,i,l);
        }
    }
    public static String  swap(String str,int i,int l){
        char [] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[l];
        charArray[l]=temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int  n=str.length();
        findcomb(str,0,n-1);

    }
}
