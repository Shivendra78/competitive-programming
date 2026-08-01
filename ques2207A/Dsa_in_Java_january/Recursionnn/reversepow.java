package Recursionnn;


public class reversepow {

     public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int reversed=0;
          while(b>0){
            int digit=b%10;
            reversed=reversed*10+digit;
            b=b/10;

        }
        
        int call=pow(a,reversed/2);
        if(reversed%2==0){
            return  call*call;
        }else{
            return a*call*call;
        }
    }
    public static void main(String[] args) {
        
    }
}
