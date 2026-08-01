package Stringss;

public class StringToCarachterArray {
    public static void main(String[] args) {
        String s="Rohan";

        char [] arr=s.toCharArray();

        for(char ch:arr){
            System.out.println(ch);
        }

        System.out.println(arr);
    }
}
