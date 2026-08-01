package Arrays;

public class merge {
    public static void main(String[] args) {
        
       int arr[] = {12, 34, 45, 56, 123, 234};
        int brr[] = {12, 12, 23, 45, 67, 768};
        int crr[]=new int[arr.length+brr.length];

        merge(crr,arr,brr);

        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }

    private static void merge(int[] crr, int[] arr, int[] brr) {
        int i=0;
        int j=0;
        int k=0;

        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            }else{
                crr[k]=brr[j];
                j++;
                k++;
            }

            if(i==arr.length){
                while(j<brr.length){
                    crr[k]=brr[j];
                    j++;
                    k++;
                }
            }

            if(j==brr.length){
                while(i<arr.length){
                    brr[j]=arr[i];
                    i++;
                    j++;
                }
            }
        }
    }
}
