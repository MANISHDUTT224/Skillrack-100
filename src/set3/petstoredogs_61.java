package set3;

import java.math.BigInteger;
import java.util.Scanner;

public class petstoredogs_61 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        BigInteger[] ways=new BigInteger[n+1];
        for(int i=0;i<=n;i++){
            if(i<=2){
                ways[i]=new BigInteger(i+"");
            }
            else{
                BigInteger passive=new BigInteger((i-1)+"").multiply(ways[i-2]);
                ways[i]=passive.add(ways[i-1]);
            }
        }
        System.out.println(ways[n]);
    }
}
/*
Test Case 1:
2
Output:
2
Test Case 2:
4
Output:
10
 */