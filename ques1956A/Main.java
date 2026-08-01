package ques1956A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int q = sc.nextInt();

            int first = sc.nextInt(); // a[0]

            // Read remaining elements (not needed)
            for (int i = 1; i < k; i++) {
                sc.nextInt();
            }

            for (int i = 0; i < q; i++) {
                int n = sc.nextInt();
                System.out.print(Math.min(n, first - 1) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}