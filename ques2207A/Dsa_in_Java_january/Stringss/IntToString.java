package Stringss;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        // String s=""; //empty String

        // s+=n;
  
        // System.out.println(s);

        String s=Integer.toString(n);
        System.out.println(s);


    }
}
