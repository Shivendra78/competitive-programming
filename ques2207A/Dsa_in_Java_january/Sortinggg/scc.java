package Sortinggg;

public class scc {
    public static void main(String[] args) {
        int arr[]={12,45,32,13,90};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int mixdx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                    mixdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mixdx];
            arr[mixdx]=temp;
        }

        print(arr);
        }

    private static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
