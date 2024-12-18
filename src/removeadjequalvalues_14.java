import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class removeadjequalvalues_14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                st.pop();
            }
            else{
                st.push(arr[i]);
            }
        }
        ArrayList<Integer>newarr=new ArrayList<>();
        while(!st.isEmpty()){
            newarr.add(st.peek());
            st.pop();
        }
        for(int i=newarr.size()-1;i>=0;i-=1){
            System.out.println(newarr.get(i));
        }
    }
}
