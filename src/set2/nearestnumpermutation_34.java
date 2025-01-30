package set2;

import java.util.Scanner;
public class nearestnumpermutation_34 {
    private static int closest;
    public static void permute(String a,int b,int curlen,int size){
        if(curlen==size){
            int curint=Integer.parseInt(a);

            if(Math.abs(curint-b)<Math.abs(closest-b)){
                closest=curint;
            }
            return;
        }
        for(int i=curlen;i<=size;i++){
            a=swap(a,curlen,i);

            permute(a,b,curlen+1,size);
            a=swap(a,curlen,i);
        }
    }
    public static String swap(String a,int left,int right){
        char[] c=a.toCharArray();
        char temp=c[left];
        c[left]=c[right];
        c[right]=temp;
       return String.valueOf(c);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=s.nextInt();
        closest=Integer.parseInt(str);
        permute(str,n,0,str.length()-1);
        System.out.println("Closest number to n : "+closest);

    }
}
