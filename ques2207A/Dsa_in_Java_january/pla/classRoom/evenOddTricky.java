package pla.classRoom;

import java.util.Scanner;

public class evenOddTricky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        while(n!=1){
            System.out.println(n+" ");
            if(n%2==0){
                n=n/2;
            }else{
                n=3*n+1;
            }
        }
        System.out.println(1);
    }
}
