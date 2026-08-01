package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={12,34,45,21,98};

        int searchElement=98;

        int searchIdx=-1;

        boolean flag=false; //false means target arrray me nhi hai

        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchElement){
                System.out.println("The given element has index number: "+i);
                flag=true; //means target array me hai
                
                break;
            }
            searchIdx++;
        }

        if(flag==true){
            System.out.println("Exist in array");
        }else{
            System.out.println("Target is misisng");
        }
        System.out.println("Given element is present at index: "+searchIdx);
    }
}
