package stacksss;

import java.util.Stack;

public class RemoveAtPosition {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        // pushing elements
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int pos = 2; // position from TOP (0-based)

        // Step 1: move elements from st to temp until we reach target position
        int count = 0;
        while (count < pos) {
            temp.push(st.pop()); // top elements ko temp me store kar rahe hain
            count++;
        }

        // Step 2: remove the target element
        st.pop(); // ye wala element delete ho jayega

        // Step 3: bring back elements from temp to original stack
        while (!temp.isEmpty()) {
            st.push(temp.pop()); // original order restore kar rahe hain
        }

        // Final stack print
        System.out.println(st);
    }
}