package Sortinggg;
public class MergeSOrt {

    public static void merge(int []a,int []b,int []c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=  b[j]){
                c[k++]=a[i++];

            }else{
                c[k++]=b[j++];
            }

            while(i<a.length) c[k++]=a[i++];
            while(j<b.length) c[k++]=b[j++];
        }
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,4,1,8,9};
        mergeSortt(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    private static void mergeSortt(int[] arr) {
        int n=arr.length;
        if(n==1) return; // 1 length array is pehle se sorted
        //step1:Create two new Empty arrays of size n/2;

        int [] a=new int[n/2];
        int [] b=new int[n-n/2];

     //step2:copy paste arr into a and b
     int idx=0;//idx travel krega arr pe

     for(int i=0;i<a.length;i++){
        a[i]=arr[idx++];
     }
     for(int i=0;i<b.length;i++){
        b[i]=arr[idx++];
     }

     //step 3 magic
     mergeSortt(a);
     mergeSortt(b);

     //step4: Merge 'a' and 'b' into arr
     merge(a, b, arr);

    }
}
