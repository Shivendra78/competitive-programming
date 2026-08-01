package Stringss;

public class InterningNew {
    public static boolean equals(String s1,String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="raghav";
        String s2=new String("Ragahv"); 
        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        // System.out.println(s1==s2); //false

        String s3=new String("Shivam");
        String s4=new String("Shivam");

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
