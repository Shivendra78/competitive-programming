package ques1946A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            Arrays.sort(a);

            int mid = n / 2;
            int median = a[mid];

            int ans = 0;

            for (int i = mid; i < n && a[i] == median; i++)
                ans++;

            System.out.println(ans);
        }
    }
}