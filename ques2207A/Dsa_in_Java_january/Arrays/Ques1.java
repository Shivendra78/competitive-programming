package Arrays;

public class Ques1 {
    public static void main(String[] args) {
        int [] arr={12,34,23,14,56,67};

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
               arr[i]= arr[i]+10;
            }else{
                arr[i]=arr[i]*2;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
