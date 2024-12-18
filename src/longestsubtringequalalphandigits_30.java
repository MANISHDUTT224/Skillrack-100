import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class longestsubtringequalalphandigits_30{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        HashMap<Integer,Integer>mp=new HashMap<>();
        int count=0,pos=0,maxlen=0,curlen;
        mp.put(0,0);
        for(int i=0;i<n;i++){
            pos++;
            if(Character.isAlphabetic(str.charAt(i))){
                count++;
            }
            else{
                count--;
            }
            if(mp.containsKey(count)){
                curlen=pos-mp.get(count);
                maxlen=Math.max(curlen,maxlen);
            }
            else{
                mp.put(count,pos);
            }
        }
        System.out.println(maxlen);

    }
}