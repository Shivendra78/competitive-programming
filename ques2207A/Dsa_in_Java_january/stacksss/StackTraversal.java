package stacksss;
import java.util.Stack;

public class StackTraversal {

    public void print(){
        
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Traverse top to bottom
        System.out.println("Stack (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        // Traverse bottom to top
        System.out.println("\nStack (bottom to top):");
        for (int item : stack) {
            System.out.println(item);
        }

        
    }
}