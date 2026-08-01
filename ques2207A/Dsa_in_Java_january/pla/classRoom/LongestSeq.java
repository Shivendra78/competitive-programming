package pla.classRoom;

import java.util.Scanner;

public class LongestSeq {
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

    public static int longestSeq(String toBinary){
        int max=0;
        int n=0;
        String binary=toBinary(n);
        int len=binary.length();

        for(int i=0;i<len;i++){
            if
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }
}
