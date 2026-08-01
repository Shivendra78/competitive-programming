package Sortinggg;

public class CheckSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        int n=arr.length;

        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
               System.out.println("yes");
            }
        }
    }
}
