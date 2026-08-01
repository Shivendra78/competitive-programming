package Arrays;

public class ReverseAray {
    public static void main(String[] args) {
        int arr[]={12,34,45,56,67,78};
        int n=arr.length;
        int temp;

        int i=0;
        int j= n-1;

        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for( int ele:arr){
            System.out.print(ele+" ");
        }
       
    }
}
