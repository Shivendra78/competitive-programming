package MultidimensionalArray;

public class foreachLoop {
    public static void main(String[] args) {
          int arr[][]={{6,0,2,7,6},{1,3,7,20,2},{9,8,5,4,3}};
        //   for(int i=0;i<arr.length;i++){
        //     for(int ele:arr[i]){
        //         System.out.print(ele+" ");
        //     }
        //     System.out.println();
        //   }


        //2nd method
          for(int []a:arr){
            for(int ele:a){

                System.out.print(ele+" ");
            }
            System.out.println(  );
          }
    }
}
