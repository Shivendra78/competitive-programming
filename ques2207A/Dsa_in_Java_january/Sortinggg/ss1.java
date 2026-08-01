package Sortinggg;

public class ss1 {
    public static void main(String[] args) {
        int arr[]={12,89,34,56,23};
        selectionSort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for(int ele:arr){
         System.out.print(ele+" ");
        }

    }

    private static void selectionSort(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;

            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;

        }
        System.out.println();
    }
}
