package Revision.arrays;

public class mult {
    public static void main(String[] args) {
        // int arr[]=new int[6];
        int[] arr={12,34,45,23,45,56};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]*10;
            }else{
                arr[i]=arr[i]*2;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
