// package ques2126A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String x = sc.next();

            char minDigit = '9';

            for (char c : x.toCharArray()) {
                if (c < minDigit) {
                    minDigit = c;
                }
            }

            System.out.println(minDigit);
        }
    }
}
