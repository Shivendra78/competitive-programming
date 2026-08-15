import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int zero = 0;
            int minusOne = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 0) {
                    zero++;
                } else if (x == -1) {
                    minusOne++;
                }
            }

            int ans = zero + (minusOne % 2) * 2;

            System.out.println(ans);
        }

        sc.close();
    }
}