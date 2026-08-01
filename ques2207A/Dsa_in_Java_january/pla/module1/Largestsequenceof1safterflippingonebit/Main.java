package pla.module1.Largestsequenceof1safterflippingonebit;

public class Main {

    // Convert decimal number to binary string manually
    public static String toBinary(int n) {

        // Special case
        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            int remainder = n % 2;      // get 0 or 1
            binary = remainder + binary; // add at the front
            n = n / 2;                 // divide by 2
        }

        return binary;
    }

    // Find largest sequence of 1's after flipping one 0
    public static int longestSequence(int n) {

        // Use our own binary conversion
        String bin = toBinary(n);

        int max = 0;

        // Check every bit
        for (int i = 0; i < bin.length(); i++) {

            // Only flip 0
            if (bin.charAt(i) == '0') {

                // Count left side 1's
                int left = 0;
                int j = i - 1;

                while (j >= 0 && bin.charAt(j) == '1') {
                    left++;
                    j--;
                }

                // Count right side 1's
                int right = 0;
                j = i + 1;

                while (j < bin.length() && bin.charAt(j) == '1') {
                    right++;
                    j++;
                }

                // Flip this 0 and connect both sides
                int current = left + 1 + right;

                if (current > max) {
                    max = current;
                }
            }
        }

        // If there was no 0, answer is the length itself
        if (max == 0) {
            max = bin.length();
        }

        return max;
    }

    public static void main(String[] args) {

        int n = 177;

        // Convert to binary without inbuilt function
        String binary = toBinary(n);

        System.out.println("Decimal number : " + n);
        System.out.println("Binary number  : " + binary);

        int result = longestSequence(n);

        System.out.println(
                "Largest sequence of 1's after flipping one bit : "
                        + result);
    }
}