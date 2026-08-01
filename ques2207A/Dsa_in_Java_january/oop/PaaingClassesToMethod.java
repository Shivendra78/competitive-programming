package oop;

public class PaaingClassesToMethod {
    public static class Car{
        int seats;
        String name;
        double lenght;
        String type;
        int torque; 

        void print(){
            System.out.println(seats+" "+name+" "+lenght+" "+type+" "+torque);
        }

    }

    public static void main(String[] args) {
        Car c =new Car();
        c.lenght=2.33;
        c.name="naina";
        c.seats=5;
        c.torque=178;
        c.type="Suv";

        change(c);
        System.out.println(c.seats);
        c.print();
    }

    private static void change(Car c) {
     c.seats=9;


    }
}
