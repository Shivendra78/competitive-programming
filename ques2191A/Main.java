import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] pos = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                pos[x] = i;
            }

            boolean possible = true;

            for (int x = 1; x < n; x++) {
                if (pos[x] % 2 == pos[x + 1] % 2) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}