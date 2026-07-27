import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (k == 1) {
                System.out.println(n);
                continue;
            }

            long ans = 0;

            while (n > 0) {
                ans += n % k;
                n /= k;
            }

            System.out.println(ans);
        }
    }
}