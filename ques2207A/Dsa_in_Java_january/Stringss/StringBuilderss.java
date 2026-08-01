package Stringss;

// import java.util.ArrayList;

public class StringBuilderss {
    public static void main(String[] args) {
        // ArrayList <Character> str=new ArrayList<>();
        // str.add('q');
        // str.set(0, 'u');

        StringBuilder sb=new StringBuilder("Shivam");
        System.out.println(sb);

        System.out.println(sb.length()+" "+sb.capacity());
       
        sb.append(" Pandey");
        System.out.println(sb);

        sb.setCharAt(1, 'v');
        System.out.println(sb);

        String t=sb.toString();
        System.out.println(t);


    }
}
