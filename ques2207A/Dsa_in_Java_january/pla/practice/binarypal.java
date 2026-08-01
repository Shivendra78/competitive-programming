package pla.practice;

public class binarypal {
    public static boolean binaPal(int n){
        String binary=Integer.toBinaryString(n);
        int left=0;
        int right=binary.length()-1;

        while(left<=right){
            if(binary.charAt(left)!=binary.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
