package stacksss;

import java.util.Stack;

public class prac1 {
    // public static void main(String[] args) {
    //     Stack <Integer> st1=new Stack<>();
    //     st1.push(10);
    //     st1.push(20);
    //     st1.push(30);
    //     st1.push(50);
    //     st1.push(60);

    //     System.out.println(st1.peek());
    //    int size= st1.size();
    //    System.out.println(size);

    //    st1.pop();
    //    int size1=st1.size();
    //    System.out.println(size1);
    // }

    public static void PushAtBottom(Stack <Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }

        int top=st.pop();
        PushAtBottom(st,ele);
        st.push(top);

    }

    public static void pushAtB(Stack <Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }

        int top=st.pop();
        pushAtB(st, ele);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        Stack <Integer> st1=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);

        while(st.size()>0){
            int top=st.pop();
            System.out.println(top);
            st1.push(top);
        }

        while(st1.size()>0){
            st.push(st1.pop());
        }

        System.out.println(st);
    }
}
