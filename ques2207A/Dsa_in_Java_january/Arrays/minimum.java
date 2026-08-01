package Arrays;

public class minimum {
    public static void main(String[] args) {
        int arr[]={12,45,67,90,1,2,3};
        int n=arr.length;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum number in the given arrya is : "+min);
    }
}
