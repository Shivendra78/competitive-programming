package stacksss;

import java.util.Stack;

public class prac {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        stack.push(10);
        stack.push(19);
        stack.push(120);
        stack.push(191);
        stack.push(196);

        // Move elements until only bottom remains
        while(stack.size() > 1){
            stack1.push(stack.pop());
        }

        // Bottom element
        System.out.println(stack.peek());
    }
} 