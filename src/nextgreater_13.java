import java.util.Scanner;
import java.util.Stack;


public class nextgreater_13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        int n= s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int nextgreater;
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
               st.push(arr[i]);
            }
            if(st.peek()>arr[i]){
                nextgreater=st.peek();
                st.push(arr[i]);
                arr[i]=nextgreater;
            }
            else{
                while(!st.isEmpty() && st.peek()<arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(arr[i]);
                }
                else{
                    nextgreater=st.peek();
                st.push(arr[i]);
                arr[i]=nextgreater;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
