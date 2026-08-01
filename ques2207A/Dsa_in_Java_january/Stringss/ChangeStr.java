package Stringss;

public class ChangeStr {
    public static void main(String[] args) {
        String s="Shivam";
        if(Character.isUpperCase(s.charAt(0))){
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        
        System.out.println(s);  

    }
}
