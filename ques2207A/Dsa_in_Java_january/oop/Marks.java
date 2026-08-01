package oop;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int [] marks;

        StudentData(int s){
            marks=new int[s];
        }

        StudentData (int[] s){ //Shallow copy in this we can change also the marks by accesing the index
            marks =s;   
        }

        // StudentData(int s){
        //     marks=new int[s];
        // }

        // StudentData (int [] ss){
        //     marks=Arrays.copyOf(ss,ss.length); //deep copy cannot chnage the array ones it is assigned
        // }
    }

    public static void main(String[] args) {
        // StudentData s1=new StudentData(4);
        // StudentData s2=new StudentData(2);

        // s1.marks[0]=89;
        // s1.marks[1]=95;
        // s1.marks[2]=122;

        //using array Constructor

        int [] arr={4,7,6,1,8,3};
        StudentData s1=new StudentData(arr);
    }
}
