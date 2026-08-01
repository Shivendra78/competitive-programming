package MultidimensionalArray;

import java.util.Scanner;

public class Outputin2D {
    public static void main(String[] args) {
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,20,3,4},{2,3,4,5}};
        // int[][] arr=new int[3][4];
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[3][4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The number of rows: "+arr.length+"  and the no number of column: "+arr[0].length);

        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr[0].length;j++){
                
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
    }
}
}
