package Revision.arrays;

public class prod {
    public static int prod(int arr[]){
        int result = 1;
        for(int i=0;i<arr.length;i++){
           result*=arr[i];
        }
        return result;
    }

    public void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={12,34,56};
        prod(arr);
        int ans=prod(arr);
        System.out.println("Product "+ans);

    }
}
