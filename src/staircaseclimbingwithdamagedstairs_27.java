import java.util.Scanner;
//5 2 1    2 3    2
public class staircaseclimbingwithdamagedstairs_27 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,l,t;
        n=s.nextInt();
        l=s.nextInt();
        t=s.nextInt();
        int leaps[]=new int[l];
        for(int i=0;i<l;i++){
            leaps[i]= s.nextInt();
        }
        int damaged[]=new int[t];
        for(int i=0;i<t;i++){
            damaged[i]=s.nextInt();
        }
        long ways[]=new long[n+1];
        ways[0]=1;
        for(int step=1;step<=n;step++){
            boolean found=false;
            for(int i=0;i<t;i++){
                if(damaged[i]==step){
                    found=true;
                    break;
                }
            }
            if(found){
                continue;
            }
            for(int j=0;j<l;j++){
                if(step>=leaps[j]){
                    ways[step]+=ways[step-leaps[j]];
                }
            }

        }
        System.out.println(ways[n]);

    }
}
