package Sortinggg;

public class kthSmallest {
    public static void sortt(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void kth(int arr[],int k){
        sortt(arr);
        System.out.println();
          
    }
    public static void main(String[] args) {
        int arr[]={12,34,6,9,47};

        sortt(arr);

        System.out.println();
        kth(arr, 2);


    }
}
