
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class perumutationofstring_33{
    public static void findcomb(String str,int l,int r,Set<String>result){
        if(l==r){
            System.out.println(str);
            return ;
        }
        for(int i=l;i<=r;i++){
            str=swap(str,i,l);

            findcomb(str,l+1,r,result);
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
        Set<String> result=new TreeSet<>();
        findcomb(str,0,n-1,result);

    }
}
