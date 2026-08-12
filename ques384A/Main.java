package ques384A;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println((n * n + 1) / 2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("C");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}