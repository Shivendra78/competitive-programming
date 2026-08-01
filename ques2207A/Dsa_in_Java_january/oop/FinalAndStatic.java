package oop;

class Cricketer{
    // final String country="INDIA";
    static String country="india"; //sharable variable
    int runs;
    String name;
    double avg;

    static void greet(){
        System.out.println("I only believe in jassi bhai ");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
        Cricketer c2=new Cricketer();
        // c1.country="Engliand";
        // System.out.println(c1.country);
        c1.country="India";
        System.out.println(c2.country);
    }
}
