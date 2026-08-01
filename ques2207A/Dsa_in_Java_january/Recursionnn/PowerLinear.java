package Recursionnn;

import java.util.Scanner;

public class PowerLinear {

    // public static long pow(int a,int b){
    //     if(b==0){
    //         return 1;
    //     }
    //     return a*pow(a,b-1);
    // }    

    //most optimized way

     public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        
        int call=pow(a,b/2);
        if(b%2==0){
            return  call*call;
        }else{ 
            return a*call*call;
        }
        // return a*pow(a,b-1);
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base");
         
        int a=sc.nextInt();
        System.out.println("Enter exponent: ");

        int b =sc.nextInt();

        // System.out.println(a+" raised tot he power "+b+" is "+Math.pow(a, b));

        System.out.println(a+" raised tot he power "+b+" is "+pow(a, b));
    }
}
