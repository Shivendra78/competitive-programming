import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int countOne = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 1) {
                    countOne++;
                }
            }

            if (n % 2 != 0) {
                System.out.println("NO");
            } else {
                int sum = 2 * countOne - n;

                if (sum % 4 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}