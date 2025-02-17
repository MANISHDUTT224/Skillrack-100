import java.util.Scanner;
import java.util.Stack;

public class longestvalidparenthesesubstring_83 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       int maxlen=0;
       Stack<Integer>st=new Stack<>();
       st.push(-1);
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='('){
               st.push(i);
           }
           else{
               st.pop();
               if(st.empty()){
                   st.push(i);
               }
               else{
                   maxlen=Math.max(maxlen,i-st.peek());
               }
           }
       }
        System.out.println(maxlen);
    }
}
/*
Test Case 1:
)()())
Output:
4
Test Case 2:
(()
Output:
2
Test Case 3:
""
Output:
0
 */