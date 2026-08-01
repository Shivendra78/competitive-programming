package Sortinggg;

public class InsertionSort {

    public static void print(int []arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        
    }

    public static void main(String[] args) {
        int arr[]={12,34,45,34,23,15,78};
        print(arr);
        sort(arr);
        print(arr);

    }
}
