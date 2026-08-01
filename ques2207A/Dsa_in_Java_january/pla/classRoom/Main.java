package pla.classRoom;

import java.util.Scanner;

public class Main {
    public static void vit(){
        System.out.println("Vit");
    }
    public static void main(String[] Vit) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Grade");
        char grade = sc.next().charAt(0);
        // System.out.println("vit");
       Main.vit();
       System.out.println("-----------------------------Student Data--------------------------------------");
       System.out.println("Name - "+ name);
       System.out.println("Grade - "+ grade);

        int day=3;
       switch (day) {
        case 1:
            System.out.println("shivam");
            break;
            
            
       
        default:
            System.out.println("Invalid input");
            break;
       }

    }
}
