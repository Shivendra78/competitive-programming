package Stringss;

public class SumOfAllSubstring {
    public static void main(String[] args) {
        String s = "6759";
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String substring = s.substring(i, j);
                System.out.print(substring+" ");  // Optional: to see all substrings
                // System.out.println();
                sum += Integer.parseInt(substring);
            }
        }
        
        System.out.println("Sum of all substrings: " + sum);
    }
}
