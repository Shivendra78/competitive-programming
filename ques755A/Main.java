import java.util.*;

public class Main {

    static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int m = 1; m <= 1000; m++) {
            int x = n * m + 1;

            if (!isPrime(x)) {
                System.out.println(m);
                break;
            }
        }
    }
}