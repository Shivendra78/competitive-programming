package pla.module1.SwapNibbles;

public class SwapNibbles {

    public static int swapNibbles(int n) {

        int upper = (n & 0xF0) >> 4;  // get upper nibble
        int lower = (n & 0x0F) << 4;  // get lower nibble

        return upper | lower;
    }

    public static void main(String[] args) {

        int n = 100;   // 01100100

        int result = swapNibbles(n);

        System.out.println("Original : " + n);
        System.out.println("Swapped  : " + result);
    }
}