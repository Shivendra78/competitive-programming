package pla.practice;

public class sieveAlgo {
    public static void seive(int n){
        boolean prime[]=new boolean[n+1];

        for(int i=2;i<=n;i++){
            prime[i]=true;
        }

        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }

           // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
