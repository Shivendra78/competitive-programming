package Sortinggg;

public class is {
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
 public static void sortt(int []arr){
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
        int arr[]={13,90,23,45,78};
        int n=arr.length;

        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }

        print(arr);
    }
}
