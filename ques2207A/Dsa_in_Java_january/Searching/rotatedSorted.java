package Searching;

public class rotatedSorted {
    public static void search(int arr[],int target){
        int n=arr.length;
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("index: ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,1,2,3};

    }
}
