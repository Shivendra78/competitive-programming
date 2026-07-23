import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int f : freq) {
                if (f > 0) list.add(f);
            }

            int ans = 0;

            for (int x = 1; x <= 100; x++) {
                int cnt = 0;
                for (int f : list) {
                    if (f >= x) cnt++;
                }
                ans = Math.max(ans, x * cnt);
            }

            System.out.println(ans);
        }
    }
}