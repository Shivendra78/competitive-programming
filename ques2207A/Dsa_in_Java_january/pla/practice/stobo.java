package pla.practice;

public class stobo {
    public static boolean isSub(String num){
        int left=0;
        int right=num.length()-1;
        while(left<=right){
            char a=num.charAt(left);
            char b=num.charAt(right);
            if((a=='0' && b=='0' ) || (a=='1' || b=='1') || (a=='6' || b=='9') || (a=='8'|| b=='8') || (a=='9' && b=='6')){
                    left++;
                    right--;
            }
            return false;
              }
                return true;
            }
}
