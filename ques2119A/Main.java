import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            if (a > b) {
                if ((a % 2 == 1) && (a - 1 == b))
                    System.out.println(y);
                else
                    System.out.println(-1);
                continue;
            }

            long ans = 0;

            while (a < b) {
                if (a % 2 == 0)
                    ans += Math.min(x, y);
                else
                    ans += x;
                a++;
            }

            System.out.println(ans);
        }
    }
}