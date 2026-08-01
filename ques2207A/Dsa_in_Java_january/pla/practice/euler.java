package pla.practice;

public class euler {
   public static int phi(int n){
    int result=n;
    for(int p=2;p*p<=n;p++){
        if(p%n==0){
            while(p%n==0){
                p/=n;
            }
            result-=result/p;
        }
    }
    if(n>1){
        result-=result/n;
    }
    return result;
   }
}
