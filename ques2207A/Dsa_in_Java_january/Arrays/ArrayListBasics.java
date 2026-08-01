package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        // ArrayList <Integer>arr=new ArrayList<>()
        arr.add(73);
        arr.add(53);
        arr.add(23);
        arr.add(3);
        arr.add(93);

        System.out.println(arr.get(3));
        System.out.print(arr+" "); //not traversing the array by ourselves

        Collections.reverse(arr);//inbuilt feature that reversd an array

        //Now how to manually lets see

        int i=0;
        int j=arr.size()-1;

        while(i<j){
            int temp=arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.print(arr+" ");

        //we can make arrayList of Character also

        ArrayList<Character> arr2=new ArrayList<>();
        ArrayList<String> arr3=new ArrayList<>();
    }
}
