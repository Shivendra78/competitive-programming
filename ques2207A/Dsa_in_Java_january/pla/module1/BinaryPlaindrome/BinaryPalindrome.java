package pla.module1.BinaryPlaindrome;

import java.util.Scanner;

public class BinaryPalindrome {

    public static boolean isBinaryPalindrome(int n) {

        // Convert number to binary string
        String binary = Integer.toBinaryString(n);

        int left = 0;
        int right = binary.length() - 1;

        // Compare characters from both sides
        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        System.out.println("Binary form: " + binary);

        if (isBinaryPalindrome(n)) {
            System.out.println(n + " is a Binary Palindrome");
        } else {
            System.out.println(n + " is NOT a Binary Palindrome");
        }
    }
}