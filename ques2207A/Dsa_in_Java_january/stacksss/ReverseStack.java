package stacksss;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        Stack <Integer> st1=new Stack<>();
        Stack <Integer> st2=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        while(st.size()>0){
            st1.push(st.pop());
        }

        System.out.println(st1);
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        System.out.println(st2);

        while(st2.size()>0){
            st.push(st2.pop());
        }

        System.out.println(st);
    }
}
