package pla.practice;

import java.util.Scanner;

public class prac {
    public static boolean booleanPalind(int n){
        String binary=Integer.toBinaryString(n);
        int left=0;
        int right=binary.length()-1;
         while(left<right){
                if(binary.charAt(left)!=binary.charAt(right)){
                    return false;
                }
                
                
                left++;
                right--;
            }
            return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the integer: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String binary=Integer.toBinaryString(n);
        System.out.println("Binary form+ "+binary);

        if(booleanPalind(n)){
            System.out.println(n+ " is a boolean palindrome");
        }else{
            System.out.println(n+" Not a palindrome");
        }

    }
}
