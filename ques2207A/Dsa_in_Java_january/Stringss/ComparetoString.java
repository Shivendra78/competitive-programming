package Stringss;

public class ComparetoString {

    public static int CompareTo(String a,String b){
        int c1=a.length();

        int c2=b.length();
        int result;

        if(c1>c2){
            result=c1-c2;
        }else{
            result=c2-c1;

        }

        if(c1==c2){
            result=0;
        }

        return result;
    }
    public static void main(String[] args) {
        String a="raghjav";
        String b="preet";

        // System.out.println(a.compareTo(b));
        System.out.println(CompareTo(a, b));
    }
}
