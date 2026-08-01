package Stringss;
import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String word="newlyshivamshivanimadeconnectionanditisbeautiful";
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u'){
                count++;
            }
            System.out.print(word.charAt(i));
        }
        System.out.println("Total number of vowels in this String is: "+count);
    }
}
