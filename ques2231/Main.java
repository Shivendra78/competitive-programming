package ques2231;

import java.util.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int t = sc.nextInt();

        while (t > 0) {

            // Read n
            int n = sc.nextInt();

            // Print numbers from (n+1) to (2*n)
            for (int i = n + 1; i <= 2 * n; i++) {

                System.out.print(i);

                // Print space after every number except the last one
                if (i != 2 * n) {
                    System.out.print(" ");
                }
            }

            System.out.println();

            t--;
        }

        sc.close();
    }
}