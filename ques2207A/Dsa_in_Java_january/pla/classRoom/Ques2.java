package pla.classRoom;


    import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 2) {
            System.out.println(1);
            return;
        }

        if (n == 3) {
            System.out.println(2);
            return;
        }

        int product = 1;

        while (n > 4) {
            product*=3;
            n -= 3;
        }

        product *= n;

        System.out.println(product);
    }
}

