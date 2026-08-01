package Arrays;

public class rotate {
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k-1, n-1);
    }
    public static void main(String[] args) {
        int arr []={12,34,45,56,67,67};
        int k=3;
        rotate(arr,k);


        
    }
}
