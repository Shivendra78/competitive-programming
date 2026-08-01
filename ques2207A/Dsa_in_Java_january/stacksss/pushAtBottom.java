package stacksss;

import java.util.Stack;

import Recursionnn.reverse;

public class pushAtBottom {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int ele=50;
        System.out.println(st);
        PushAtBottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println("After reversing");
        System.out.println(st);
        
    }

    private static void reverse(Stack<Integer> st) {
       if(st.size()<=1) return;
       int top=st.pop();
       reverse(st); //magic
       PushAtBottom(st,top);
    }

    private static void PushAtBottom(Stack<Integer> st, int ele) {
       if(st.size()==0){
        st.push(ele);
        return;
       }
       int top=st.pop();
       PushAtBottom(st,ele);
       st.push(top);
    }
}
