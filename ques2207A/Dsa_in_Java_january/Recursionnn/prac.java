package Recursionnn;

public class prac {

    public static void reverseArr(int arr[],int idx){
        int n=arr.length;
        if(idx==n) return;
        reverseArr(arr, idx+1);
        System.out.print(arr[idx]+" ");
    }

    public static boolean exists(int arr[],int target,int idx){
            if(idx==arr.length) return false; //base case

            if(arr[idx]==target) return true;

            return exists(arr,target,idx+1);

    }
    public static void main(String[] args) {
        int arr[]={12,73,90,23,45}   ;

        
        System.out.println(exists(arr, 12, 0));

        reverseArr(arr, 0);
    }
}
