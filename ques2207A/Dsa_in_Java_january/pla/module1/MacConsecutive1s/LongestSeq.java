package pla.module1.MacConsecutive1s;


import java.util.Scanner;

public class LongestSeq {

    // Convert decimal number to binary string
    public static String toBinary(int n) {

        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        return binary;
    }

    // Find maximum consecutive 1's
    public static int longestSeq(String binary) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1') {
                count++;

                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String binary = toBinary(n);

        System.out.println("Binary = " + binary);
        System.out.println("Maximum consecutive 1's = " + longestSeq(binary));
    }
}