package oop;

public class userDefinedDataType {
    public static class Student{ //khudka ek data type create kar liya apn ne
         String name;
         int rno;
         double cgpa;
    }
    public static void main(String[] args) {
        Student s1=new Student(); //declaration
        s1.name="Khushi";
        s1.rno=12;
        s1.cgpa=9.0;

        Student s2=new Student();
        s2.name="Khushi";
        s2.rno=12;
        s2.cgpa=9.0;

        Student s3=new Student();
        s3.name="Khushi";
        s3.rno=12;
        s3.cgpa=9.0;

        System.out.println(s1.name);
    }
}
