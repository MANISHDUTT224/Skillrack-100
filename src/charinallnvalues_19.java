import java.util.*;
public class charinallnvalues_19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String [] arr=new String[n];
       int[] count=new int[26];


       for(int i=0;i<n;i++) {

           arr[i] = s.next();

           for (int j = 0; j < arr[i].length(); j++) {

               if (count[arr[i].charAt(j) - 'a'] == i) {
                   count[arr[i].charAt(j)-'a']+=1;
               }
           }

       }

        String res = "";
        for (int i = 0; i < 26; i++) {
            if (count[i] == n) {
                res+=(char)(i+97);
            }
        }

        System.out.println(res);

    }
}
