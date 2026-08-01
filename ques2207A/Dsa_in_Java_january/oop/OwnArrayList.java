package oop;
class ArrList{ //user defined data structure
    int [] arr;
    int indx=0;
    int capacity=10;
    int idx=0;
    int size=0;

    ArrList(int capacity){
        arr=new int[capacity];
    }
    void add(int ele){
        if(idx==arr.length){
            int [] arr2=new int[arr.length*2 ];

            for(int i=0;i<arr.length;i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
         arr[idx++]=ele;
         size++;
    }

    void capacityIncrease(){
         int [] arr2=new int[arr.length*2 ];

            for(int i=0;i<arr.length;i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
    }

    int capacity(){
        return arr.length;
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    int get(int index){
        return arr[index];
    }

    void set(int index,int val){
        arr[index]=val;
    }

    void removeFromEnd(){
        idx--;
        size--;
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        ArrList arr=new ArrList(8);
        System.out.println(arr.size);
        arr.add(10);
        arr.add(20);
        arr.display();
        System.out.println(arr.get(1));
    }
}
