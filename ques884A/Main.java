import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            total += (86400 - a);

            if (total >= t) {
                System.out.println(i);
                return;
            }
        }
    }
}