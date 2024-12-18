import java.util.Scanner;

public class Validstring_17{
    public static boolean recurcheck(String s1,String s2,String mix,int i,int j,int k){
        if(s1.length()+s2.length()!=mix.length()){
            return false;
        }
        if(i>=s1.length() && j>=s2.length() && k>=mix.length()){
            return true;
        }
        if(i<s1.length() && j<s2.length() && s1.charAt(i)==mix.charAt(k) && s2.charAt(j)==mix.charAt(k)){
            if(i+1<s1.length() && s1.charAt(i+1)==mix.charAt(k+1)){
                return recurcheck(s1,s2,mix,i+1,j,k+1);
            }
            else{
                return recurcheck(s1,s2,mix,i,j+1,k+1);
            }
        }
        else if( i<s1.length() && s1.charAt(i)==mix.charAt(k)){
            return recurcheck(s1,s2,mix,i+1,j,k+1);
        }
        else if( j<s2.length() && s2.charAt(j)==mix.charAt(k)){
            return recurcheck(s1,s2,mix,i,j+1,k+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String mix=s.nextLine();
        System.out.println(recurcheck(s1,s2,mix,0,0,0));
    }
}