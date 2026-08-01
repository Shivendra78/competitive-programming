package Sortinggg;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,0,1,4};
        int n=arr.length;
        print(arr);

        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            //swap
        int temp=arr[i];
        arr[i]=arr[mindx];
        arr[mindx]=temp;
        }
        System.out.println();
        print(arr);

      

    }

    public static void print(int[] arr) {
      for(int ele:arr){
        System.out.print(ele+" ");
      }
    }
}
