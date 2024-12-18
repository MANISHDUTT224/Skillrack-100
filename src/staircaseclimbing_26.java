import java.util.Scanner;

public class staircaseclimbing_26 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=s.nextInt();
        int leaps[]=new int[l];
        for(int i=0;i<l;i++){
            leaps[i]=s.nextInt();
        }
        long ways[]=new long[n+1];
        ways[0]=1;
        for(int step=1;step<=n;step++){
            for(int i=0;i<l;i++){
                if(step>=leaps[i]){
                    ways[step]+=ways[step-leaps[i]];
                }
            }
        }
        System.out.println(ways[n]);
    }
}
