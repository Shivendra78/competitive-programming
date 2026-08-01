package Arrays;

//Time exceed error
public class duplicate {
    public static void duplicateValue(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate eleemt is "+arr[i]);
                    break;
                }
            }
        }
        System.out.println("No dublicate element is foubd");
    }
    public static void main(String[] args) {

        int arr[]={12,45,56,67,67};
        duplicateValue(arr);
        
    }
}
