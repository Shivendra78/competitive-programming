// package ques1912A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int totalL = 0, totalO = 0;

        // Count total L and O
        for (char c : s.toCharArray()) {
            if (c == 'L')
                totalL++;
            else
                totalO++;
        }

        int leftL = 0, leftO = 0;

        // Try every cut
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'L')
                leftL++;
            else
                leftO++;

            int rightL = totalL - leftL;
            int rightO = totalO - leftO;

            if (leftL != rightL && leftO != rightO) {
                System.out.println(i + 1); // cut after position i
                return;
            }
        }

        System.out.println(-1);
    }
}