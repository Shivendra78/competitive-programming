import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            int count = 0;

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                if (set.contains(x)) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}