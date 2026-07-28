package ques2094A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            System.out.println("" + a.charAt(0) + b.charAt(0) + c.charAt(0));
        }

        sc.close();
    }
}