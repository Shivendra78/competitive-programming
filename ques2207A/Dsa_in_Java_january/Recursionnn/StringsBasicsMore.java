package Recursionnn;

import java.util.ArrayList;
import java.util.List;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s="Shivam";
        change(s);
        System.out.println(s);

        String [] arr={"Shivani","Shaurya","kaushal","arush"};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        List <String> al=new ArrayList<>();
        al.add("Shivam");
        al.add("shaurya");
        al.add("Shivani");
        al.add("riya");

        System.out.println(al);

        change2(al);
        System.out.println(al);
    }

    public static void change2(List<String> al) {

        al.add("Soumya");
    }

    public static void change(String s) {
        s="shivani";
    }

    
}
