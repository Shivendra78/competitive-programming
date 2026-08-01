package Stringss;

public class ReverseSb {
    public static void main(String[] args) {
        // String s="Shivam";
        // StringBuilder sc=new StringBuilder(s);

        //reverse an Stringgggg  

        // int i=0;
        // int j=s.length()-1;

        // while(i<=j){
        //     char temp1=sc.charAt(i);
        //     char temp2=sc.charAt(j);
        //     sc.setCharAt(i,temp2);
            
        //     sc.setCharAt(j,temp1);

        //     i++;j--;

        // }
        // System.out.println(sc);
        // System.out.println(sc.reverse());

        // sc.deleteCharAt(4);
        // sc.insert(1, "shivani");
        // sc.delete(2,4); //2 to 4 delete
        // System.out.println(sc);

        String s="Advitya";

        StringBuilder sb=new StringBuilder(s);

        sb.reverse();

        s=sb.toString();
 
        System.out.println(s);
    }
}
