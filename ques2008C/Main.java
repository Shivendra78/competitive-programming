package ques2008C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();

            long diff = r - l;
            long sum = 0;
            long count = 0;

            while (sum + count + 1 <= diff) {
                count++;
                sum += count;
            }

            System.out.println(count + 1);
        }

        sc.close();
    }
}