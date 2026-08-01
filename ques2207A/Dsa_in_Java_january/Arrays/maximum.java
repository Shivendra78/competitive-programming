package Arrays;

public class maximum {
    // public static void main(String[] args) {
    //     int arr[]={12,45,667,22,12,13};
    //     int max=arr[0];

    //     for(int i=0;i< arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     System.out.println("The maximum element in the array is : "+max);
    // }

    public static void main(String args[]){
        int [] arr={1,2,4,6};
        // int max=arr[0];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
