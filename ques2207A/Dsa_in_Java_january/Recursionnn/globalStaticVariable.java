package Recursionnn;

import java.util.Scanner;

public class globalStaticVariable {




    // static int x=10; //static function sharble to all methods
    //ye global variable hai static

    // public static void main(String[] args) {
    //     fun();
    //     System.out.println(x);
    // }
    // public static void fun(){
    //     x=30;
    // }

    
    //print the number in reverse orer
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0){
            return;

        }
        System.out.print(n+" ");
        print(n-1);
    }

     static int n;

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();

    //     print(1,n);

    // }

    // public static void print(int x,int n){
    //     if(x>n){
    //         return;
    //     }
    //     System.out.println(x);
    //     print(x+1,n);
    // }
}
