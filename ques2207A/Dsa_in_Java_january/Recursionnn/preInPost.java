package Recursionnn;

public class preInPost {
     public static void main(String[] args) {
        pip(2);
     }

     public static void pip(int n){
        if(n==0){
            return;
        }
        System.out.print("Pre: "+n+" "); //pre
        pip(n-1);
        System.out.print("In: "+n+" ");//in
        pip(n-1);
        System.out.print("Post: "+ n+" ");//post
     }
}
