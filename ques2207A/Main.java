package ques2207A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ones = 0;
            for (char c : s.toCharArray())
                if (c == '1')
                    ones++;

            // Minimum
            int removable = 0;
            int i = 0;
            while (i < n) {
                if (s.charAt(i) == '1') {
                    int j = i;
                    while (j < n && s.charAt(j) == '1')
                        j++;
                    int len = j - i;
                    removable += (len - 1) / 2;
                    i = j;
                } else {
                    i++;
                }
            }

            int minimum = ones - removable;

            // Maximum
            int maximum = ones;
            int first = s.indexOf('1');

            while (first != -1) {
                int second = first + 1;
                while (second < n && s.charAt(second) != '1')
                    second++;

                if (second == n)
                    break;

                maximum += second - first - 1;
                first = second;
            }

            System.out.println(minimum + " " + maximum);
        }

        sc.close();
    }
}