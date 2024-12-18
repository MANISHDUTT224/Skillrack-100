import java.util.*;
public class minoprfromzeroton_21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int minopr=0;
        while(n!=0){
            if(n%2==1){
                n--;
            }
            else{
                n/=2;
            }
            minopr++;
        }
        System.out.println(minopr);
    }
}
