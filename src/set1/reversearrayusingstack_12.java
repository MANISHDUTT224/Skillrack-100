package set1;

import java.util.Scanner;

class Stack1{
    int top,arr[];
    public Stack1(){
        top=-1;
        arr=new int[100];
    }
    public void push(int ele){
        arr[++top]=ele;

    }
    public int pop(){
        int val=arr[top--];
        return val;
    }
    public boolean isempty(){
        return top==-1;
    }
    public int peek(){
        if(top>=0) {
            return arr[top];
        }
        else{
            return -1;
        }
    }
    public void disp(){

        while(top>=0){
            System.out.print(arr[top--]+" ");
        }
    }
}
public class reversearrayusingstack_12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack1 st=new Stack1();
        int n=s.nextInt();
        int ogarray[]=new int[n];
//        st.push(2);
//        st.push(4);
//        st.push(1);
//        System.out.println("Popped element :"+st.pop());
//        System.out.println("Is my stack empty : "+((st.isempty())?"Yes":"No"));
//        st.pop();
//        System.out.println("Peak element : "+st.peek());
        for(int i=0;i<n;i++){
            ogarray[i]=s.nextInt();
            st.push(ogarray[i]);
        }
        st.disp();


    }
}
