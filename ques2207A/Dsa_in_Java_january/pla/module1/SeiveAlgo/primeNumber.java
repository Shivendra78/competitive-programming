
package pla.module1.SeiveAlgo;
public class primeNumber {
    public static void prime(int n){
        boolean [] prime=new boolean[n+1];

        //Initially  mark all boolean as prime
        for (int i=2;i<=n;i++){
            prime[i]=true;
        }

        //mark multiples as not prime
        for(int p=2;p*p<=n ;p++){
            if(prime[p]){
                for(int i=p*p ;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }

        //print all primeNumber
        for(int i=2;i<=n;i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=50;
        prime(n);
    }
}
