package pla.module1.EulerPhiAlgo;

import java.util.Scanner;

public class BinaryPalindrome {

    public static boolean isBinaryPalindrome(int n) {

        // Special case
        if (n == 0)
            return true;

        // Find position of most significant bit
        int left = 31;

        while (((n >> left) & 1) == 0) {
            left--;
        }

        int right = 0;

        // Compare bits from both ends
        while (left > right) {

            int leftBit = (n >> left) & 1;
            int rightBit = (n >> right) & 1;

            if (leftBit != rightBit) {
                return false;
            }

            left--;
            right++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isBinaryPalindrome(n)) {
            System.out.println(n + " is a Binary Palindrome");
        } else {
            System.out.println(n + " is NOT a Binary Palindrome");
        }
    }
}