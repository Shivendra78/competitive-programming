package stacksss;

import java.util.Stack;

public class peekAtanyPosition {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();

        Stack <Integer> st1=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int pos=2;

        for(int i=0;i<pos;i++){
            st1.push(st.pop());

        }

        System.out.println(st.peek());
        while(st1.size()>0){
            st.push(st1.pop());
        }

        System.out.println(st);


        System.out.println("Now pop Operation");

        for(int i=0;i<pos;i++){
            st1.push(st.pop());
        }

        st.pop();

        while(st1.size()>0){
            st.push(st1.pop());
        }

        System.out.println(st);

        System.out.println("Pushing Value at any Position");

        int val=99;

        for(int i=0;i<pos;i++){
            st1.push(st.pop());
        }

        st.push(val);

        while(st1.size()>0){
            st.push(st1.pop());
        }

        System.out.println(st);

    }
}
