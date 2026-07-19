package ques2072A;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            if (Math.abs(k) > n * p) {
                System.out.println(-1);
            } else {
                System.out.println((Math.abs(k) + p - 1) / p);
            }
        }

        sc.close();
    }
}