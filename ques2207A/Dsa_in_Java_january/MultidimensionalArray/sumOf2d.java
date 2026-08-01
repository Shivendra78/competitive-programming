package MultidimensionalArray;

import java.util.Scanner;

public class sumOf2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("ENter the number of column: ");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        int arrSum=0;
        //Now we have to find the sum of the given array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arrSum+=arr[i][j];
            }
        }

        System.out.println("The summation of the given array is : "+arrSum);
    }
}
