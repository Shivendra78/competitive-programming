package Recursionnn;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=n*fact(n-1);
        return ans;
    }
     public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=fact(n);
        System.out.println("The factorial of: "+n+" is "+a);



     }
}
