import java.util.Scanner;

public class maxcontinuousconsonants_01 {
    public static boolean isvow(char c){
        return c=='a' || c=='e' || c=='i' ||c=='o'||c=='u';
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int k=s.nextInt();
        int n=str.length();
        int consonantcount=0;
        for(int i=0;i<k;i++){
            if(!isvow(str.charAt(i))){
                consonantcount++;
            }
        }
        for(int i=1;i<=n-k;i++){
            if(!isvow(str.charAt(i-1))){
                consonantcount--;
            }
            if(!isvow(str.charAt(i+(k-1)))){
                consonantcount++;
            }
        }
        System.out.println(consonantcount);
    }
}
