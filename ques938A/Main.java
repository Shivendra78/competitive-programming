package ques938A;
import java.util.*;

public class Main {

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' || c == 'y';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (ans.length() > 0 &&
                isVowel(c) &&
                isVowel(ans.charAt(ans.length() - 1))) {
                continue;
            }

            ans.append(c);
        }

        System.out.println(ans);
    }
}