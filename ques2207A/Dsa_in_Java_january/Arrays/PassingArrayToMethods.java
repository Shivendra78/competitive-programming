package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int []x={12,34,45};
        change(x);
        System.out.println("Changed element after positon 1 is: "+x[1]);
    }

    public static void change(int [] x){
        x[1]=99;
    }
}
