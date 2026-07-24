import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0;

            while (n > 2) {
                long eat = n / 3;
                ans += eat;
                n -= 2 * eat;
            }

            System.out.println(ans);
        }
    }
}