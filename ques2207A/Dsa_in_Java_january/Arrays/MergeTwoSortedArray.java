package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[]={2,5,6,8,9};
        int b[]={1,34,45,67,89,90};

        int c []=new int[a.length+b.length];
          for(int ele:c){
            System.out.print(ele+" ");
        }
            System.out.println();

System.out.println();

        merge(c,a,b);
      

        for(int ele:c){
            System.out.print(ele+" ");
        }
            System.out.println();


    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){ //a array khatam-->b ke bache hue element lo
            while(j<b.length){
                c[k++]=b[j++];
            }
        }
        if(i==b.length){ //b array khatam-->a ke bache hue element lo
            while(j<a.length){
                c[k++]=a[i++];
            }
        }
     
    }
}

// class mergerTwoSortedArray{
//     public static void main(String[] args) {
//         int a[]={10,34,23,56};
//         int b[]={90,34,56,76};

//         int c[]=new int[a.length+b.length];

//         for(int ele:c){
//             System.out.println(ele+" ");
//         }
//         System.out.println();

//         merge(c,a,b);

//         for(int ele:c){
//             System.out.print(ele+" ");

//         }

//         System.out.println();
//     }

//     private static void merge(int[] c, int[] a, int[] b) {
//        int i=0;
//        int j=0;
//        int k=0;

//        while(i<a.length && j<b.length){
//         if(a[i]<b[j]){
//             c[k]=a[i];
//             i++;
//             k++;
//         }else{
//             c[k]=b[j];
//             j++;
//             k++;
//         }
//        }

//        if(i==a.length){
//         while(j<b.length){
//             c[k++]=b[j++];
//         }
//        }

//        if(j==b.length){
//         while(i<a.length){
//             c[k++]=a[i++];
//         }
//        }
//     }
// }