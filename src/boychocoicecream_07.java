import java.util.Scanner;

public class boychocoicecream_07 {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int choco[]=new int[n];
        int icecream[]=new int[n];
        choco[0]=icecream[0]=1;
        for(int i=1;i<n;i++){
            choco[i]=choco[i-1]+icecream[i-1];
            icecream[i]=choco[i-1];
        }
        System.out.println(icecream[n-1]);
    }
}

