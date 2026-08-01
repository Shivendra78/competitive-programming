package Searching;

public class BinarySearch {
    public static int Bsearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return result;
                //high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return result;
        

       
    }

    public static void main(String[] args) {
        int arr[]={12,45,56,67,78,89};
        Bsearch(arr, 67);
    }
}
