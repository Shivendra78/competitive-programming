package Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int arr[]={12,34,45,56,67,0};
        int target=12;
        System.out.println("Two sum: ");
        
    }

    boolean twoSum(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
            
        }
        return false;
    }
}
