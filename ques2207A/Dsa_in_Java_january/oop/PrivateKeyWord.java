package oop;

import java.util.Scanner;

class Student{
    String name;
    private int roll;

    double cgpa;

    void print(){ //getter
        System.out.println(name+" "+cgpa+" "+roll);
    }

    void getRno(){
        System.out.println(roll);
    }

    int getRno1(){
        return roll;
    }

    void setRno(int x){
        roll=x;
    }
    // public void p(){
    //     print();
    // }
}


public class PrivateKeyWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.print();
        s1.cgpa=8.9;
        s1.name="Shivam";
                              // s1.roll=34;
        s1.print();
        Student s2=new Student();
        s2.print();

        System.out.println(s1.getRno1());

        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
