package Revision.arrays;

public class max {
    public static void main(String[] args) {
        int arr[]={12,45,56};
        int max=arr[0];
        int maxe=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        //max value approach
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxe){
                maxe=arr[i];
            }
        }

        //min value approach
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(maxe);

        System.out.println("min: "+min);

    }
}
