package Stringss;

public class PrintSubstring {
    public static void main(String[] args) {
        String s="Gopi";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                    String ans=s.substring(i,j);
                    System.out.print(ans+" ");
            }
        }
    }
}
