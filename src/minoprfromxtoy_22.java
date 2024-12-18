import java.util.*;
public class minoprfromxtoy_22{
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        int minopr=0;
        while(b>a){
            if((b&1)==1){
                b--;
            }
            else{
                b/=2;
            }
            minopr++;
        }
        minopr+=(a-b);
        System.out.println(minopr);
    }
}
