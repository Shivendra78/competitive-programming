package MultidimensionalArray;

public class ColumWiseArray {
    public static void main(String[] args) {
        int arr[][]={{6,0,2,7,6},{1,3,7,20,2},{9,8,5,4,3}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
