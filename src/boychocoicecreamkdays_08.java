import java.util.Scanner;

public class boychocoicecreamkdays_08 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int choco[]=new int[n];
        int icecream[]=new int[n];
        choco[0]=icecream[0]=1;
        for(int i=1;i<n;i++){
            choco[i]=choco[i-1]+icecream[i-1];
            if((i+1)%k==0){
                icecream[i]=choco[i];
            }
            else {
                icecream[i] = choco[i - 1];
            }
        }
        System.out.println(icecream[n-1]);
    }
}
