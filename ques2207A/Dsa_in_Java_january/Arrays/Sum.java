package Arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of an array");
        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //printing array vlaues

        System.out.println("Printing element of the array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

     
        System.out.println("The summation of the given array is : "+sum);

        System.out.println("Checking negative value and print ing");
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count+=1;
            }else{
                // System.out.println("No element is negative in this given array");
            }

        }

        System.out.println();

        System.out.println("Printing the product of the array");

            int product=0;
            for(int i=0;i<=n;i++){
                product*=arr[i];
            }

            System.out.println("product of the given array is : "+product);
    }
}
 