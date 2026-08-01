package oop;

public class Polymarphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }

    public static class cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static class lion{
        void speak(){
            System.out.println("Grrrrrrrrrr");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hii hello");
        }
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        cat c=new cat();
        Human h=new Human();
        lion l=new lion();

        d.speak();
        c.speak();
        h.speak();
        l.speak();
    }
}
