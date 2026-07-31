package ques1946A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int p = (n + 1) / 2 - 1;
            int median = a[p];

            int ans = 0;
            for (int i = p; i < n; i++) {
                if (a[i] == median)
                    ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}