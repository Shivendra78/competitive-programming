package Recursionnn;

public class reverse {
    public static void main(String[] args) {
        int n=2456;
        // while(n!=0){
        //     r=r*10+(n%10);
        //     n=n/10;
        // }
        System.out.println(reverse(n,0)); 
        }

        public static int reverse(int n,int r){
            if(n==0){
                // System.out.println(r);
                return r;
            }
           return reverse(n/10,r*10+n%10);
        }
        
        public static int rever(int n,int r){
            if(n==0){
                return r;
            }
            return rever(n/10, r*10+n%10);
        }
    }



