package Searching;

public class bs{
    public static int bsearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
            if(arr[mid]==target){
                return result;
            }
        }
        return result;
    }

    public static int BinarySearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }

            if(arr[mid]==target){
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
