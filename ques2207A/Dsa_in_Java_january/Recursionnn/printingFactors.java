package Recursionnn;

import java.util.ArrayList;

public class printingFactors {
    public static void factor(int n1,int n2){
        ArrayList <Integer> arr=new ArrayList<>();
        ArrayList <Integer> arr1=new ArrayList<>();
        ArrayList <Integer> arr2=new ArrayList<>();
       
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                arr.add(i);
            }
        }
        for(int i=1;i<=n2;i++){
            if(n2%i==0){
                arr1.add(i);
            }
        }
        System.out.println("Factors of " + n1 + ": " + arr);
        System.out.println("Factors of " + n2 + ": " + arr1);
           for(int i=0;i<arr.size();i++){
             for(int j=0;j<arr1.size();j++){
                if (arr.get(i).equals(arr1.get(j))){
                    arr2.add(arr.get(i));
                    break;
                }
             }
        }

        System.out.println("common Factors "+arr2);

        if(arr2.size()>0){
            int max=arr2.get(0);
            for(int i=1;i<arr2.size();i++){
                if(arr2.get(i)>max){
                    max=arr2.get(i);
                }
            }
            System.out.println("gcd "+max);
        }
    }


    public static void main(String[] args) {
        factor(10, 20);
    }
}
