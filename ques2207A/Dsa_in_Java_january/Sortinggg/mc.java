package Sortinggg;

public class mc {
    public static void merge(int [] a,int []b,int[]c){
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];

            }
            while(i<a.length) c[k++]=a[i++];
            while(j<b.length) c[k++]=b[j++];
        }
    }
    private static void mergeSort(int[] arr) {
        int n=arr.length;
        if(n==1) return; 
        int [] a=new int[n/2];
        int [] b=new int[n-n/2];
         int idx=0;//idx travel krega arr pe

     for(int i=0;i<a.length;i++){
        a[i]=arr[idx++];
     }
     for(int i=0;i<b.length;i++){
        b[i]=arr[idx++];
     }

     //step 3 magic
     mergeSort(a);
     mergeSort(b);

     //step4: Merge 'a' and 'b' into arr
     merge(a, b, arr);
    }
    public static void main(String[] args) {
        int arr[]={12,45,32,23,49};
       mergeSort(arr);
         for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}


