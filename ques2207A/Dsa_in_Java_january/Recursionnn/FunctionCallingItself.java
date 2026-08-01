package Recursionnn;

public class FunctionCallingItself {

    //4 barr print hoga 
    // public static void main(String[] args) {
    //     ajay(1);

    // }

    // private static void ajay(int n) {
    //     if(n==5){
    //         return; //return will act here like a break statement
             
    //     }

    //     System.out.println(("Priya"));
    //     ajay(n+1);
    // }



    public static void print(int n){
         if(n==0){
            return; 
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
       print(5);
    }

    //Now we do same thing by recursion
    

}
