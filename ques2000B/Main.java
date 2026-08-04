package ques2000B;

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

            boolean[] occupied = new boolean[n + 2];

            occupied[a[0]] = true;
            boolean possible = true;

            for (int i = 1; i < n; i++) {
                int seat = a[i];

                if (!occupied[seat - 1] && !occupied[seat + 1]) {
                    possible = false;
                    break;
                }

                occupied[seat] = true;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}