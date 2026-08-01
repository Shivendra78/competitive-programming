package Sortinggg;

public class bubbleSort {
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    //first basic coding for this
    // public static void main(String[] args) {
    //     int [] arr={5,-2,6,7,2,0,7,2};

    //     int n=arr.length;

    //     print(arr);
    //     System.out.println("after starting of sorting");
    //     for(int i=0;i<n-1;i++){ //n-1 passes
    //         // System.out.println("passes: "+i);
    //         // print(arr);
    //         // System.out.println();
    //         for(int j=0;j<n-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }

    //     }
    //     print(arr);
    // }

    //second optimized code for this sorting
//       public static void main(String[] args) {
//         int [] arr={5,-2,6,7,2,0,7,2};

//         int n=arr.length;

//         print(arr);
//         System.out.println("after starting of sorting");
//         for(int i=0;i<n-1;i++){ //n-1 passes
//                 System.out.println("total no of passes: "+i);
//             for(int j=0;j<n-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }

//         }
//         print(arr);
//     }
// }


//Bubble sort more optimized

   public static void main(String[] args) {
        int [] arr={5,-2,6,7,2,0,7,2};

        int n=arr.length;

        print(arr);
        System.out.println("after starting of sorting");
        for(int i=0;i<n-1;i++){ //n-1 passes
            boolean isSorted=true;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true){
                break;
            }
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        print(arr);
    }


//     Better than upper more optimized solution and interview leve

//     for(int i = 0; i < n - 1; i++) {

//     boolean swapped = false;

//     for(int j = 0; j < n - 1 - i; j++) {

//         if(arr[j] > arr[j + 1]) {

//             int temp = arr[j];
//             arr[j] = arr[j + 1];
//             arr[j + 1] = temp;

//             swapped = true;
//         }
//     }

//     if(swapped)
//         break;
// }
}




