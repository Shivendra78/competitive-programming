package Arrays;


public class leet283 {
    public static void MoveZeros(int [] arr){
        int i=0;
        int n=arr.length;
        int j=n-1;
       
        
        int insertValue=0;
        for(i=0;i<n;i++){
            if(arr[i]!=0){
                arr[insertValue]=arr[i];
                insertValue++;
            }
        }

        for(i=insertValue;i<n;i++){
            arr[i]=0;

        }

       

       
        for(int ele:arr){
            System.out.print(ele+ " ");
        }

    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};

        MoveZeros(arr);
    }
}
