package pla.module1.SeiveAlgo;

import java.util.Scanner;

public class Strobogrammatic {

    public static boolean isStrobogrammatic(String num) {

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {

            char a = num.charAt(left);
            char b = num.charAt(right);

            if ((a == '0' && b == '0') ||
                (a == '1' && b == '1') ||
                (a == '8' && b == '8') ||
                (a == '6' && b == '9') ||
                (a == '9' && b == '6')) {

                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.next();

        if (isStrobogrammatic(num)) {
            System.out.println("Strobogrammatic Number");
        } else {
            System.out.println("Not a Strobogrammatic Number");
        }
    }
}