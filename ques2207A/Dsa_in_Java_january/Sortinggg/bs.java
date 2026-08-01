package Sortinggg;

public class bs {

    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.println("No of passers "+i);
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={12,89,34,56,76};

        bubbleSort(arr);

        print(arr);

        
        
    }
    
}
