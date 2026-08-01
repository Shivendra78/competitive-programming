package oop;

public class Constructor {
    public static class car{
        int seats;
        String name;
        double length;

        //COnstructor overloading
        
        car(){
            //defalt constructor
            System.out.println("i am a defalt constructor");
        }

        car(int x,String s,double d){
            seats=x;
            name=s;
            length=d;
        }

        void print(){
            System.out.println(seats+" "+name+" "+length);
        }

        //Method Overloading
        public static int max(int a,int b){
            return Math.max(a,b);
        }
        public static int max(int a,int b,int c){
            return Math.max(a,Math.max(b,c));
        }
        public static void main(String[] args) {

            car c1=new car(2, "lamborgini", 2);
            c1.print();

            car c2=new car();
        }
    }
}
