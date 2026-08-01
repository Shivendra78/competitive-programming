package stacksss;

import java.util.Stack;


public class basics {
    public static void main(String[] args) {
        Stack <String> st=new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        st.push("Shivam");
        st.push("Shivani");
        st.push("Kaja");
        st.push("CHiku");
        st.push("Shaurya");
        System.out.println(st.size());
        System.out.println(st); //As=O(n) ... esme space jyada lag rha rha
        st.pop();//it returns the topmost element and then removes it
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        String s=st.pop();
    }
}
