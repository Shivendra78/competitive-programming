package practice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;

public class p1 {
    public static void main(String args[])throws SQLException,ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "24BCE10389");

        while(true){
            System.out.println("\n 1.Insert Student");
            System.out.println("2.Update Student");
            System.out.println("3.Delete Student");
            System.out.println("4.View all Student");
            System.out.println("5.Exit");
            System.out.println("Enter choice ");

            int choice=sc.nextInt();
            sc.nextLine();

            if(choice==1){
                //Insert student
                System.out.println("Enter the name of Student");
                String name=sc.nextLine();

                System.out.println("Enter the age of the Student");
                String age=sc.nextLine();

                System.out.println("Enter the email of the student");
                String email=sc.nextLine();

                System.out.println("Enter the password of the STudent");
                String pass=sc.nextLine();

                System.out.println("Enter the Education you presue");
                String education=sc.nextLine();

                System.out.println("Enter the job you done");
                String job=sc.nextLine();

                PreparedStatement ps1=con.prepareStatement("INSERT INTO Student_db VALUES (?,?,?,?,?,?)");

                ps1.setString(1, name);
                ps1.setString(2,age);
                ps1.setString(3,email);
                ps1.setString(4,pass);
                ps1.setString(5,education);
                ps1.setString(6,job);

                int i=ps1.executeUpdate();

                if(i>0){
                    System.out.println("Inserted Successfully");
                }else{
                    System.out.println("failed");
                }
            }else if(choice==2){
                //update Student
                System.out.println("Enter email to update");
                String email=sc.nextLine();
                System.out.println("Enter the city u want to update");
                String city=sc.nextLine();

                PreparedStatement ps2=con.prepareStatement("Update Student_db SET city=? where email=?");

                ps2.setString(1,city);
                ps2.setString(2,email);

                int count =ps2.executeUpdate();
                if(count>0){
                    System.out.println("updated SUccessfully");
                }else{
                    System.out.println("failed");
                }
            }else if(choice==3){
                //Delete Student
                System.out.println("Enter email to delete");
                String email=sc.nextLine();
                PreparedStatement ps3=con.prepareStatement("Delete From Student_db Where email=?");
                ps3.setString(1, email);

                int count =ps3.executeUpdate();
                if(count>0){
                    System.out.println("Deleted Successfully");
                }else{
                    System.out.println("failed");
                }
            }else if(choice==4){
                PreparedStatement ps4=con.prepareStatement("Select * from Student_db");
                ResultSet rs=ps4.executeQuery();
                System.out.println("\n---All Student-----");
                while(rs.next()){
                    String studentName=rs.getString(1);
                    String studentAge=rs.getString(2);
                    String studentPass=rs.getString(3);
                    String studentCity=rs.getString(4);
                    String studentEdu=rs.getString(5);
                    String studentJob=rs.getString(6);

                      System.out.println("Name: " + studentName);
                    System.out.println("Age: " + studentAge);
                    System.out.println("Password: " + studentPass);
                    System.out.println("City: " + studentCity);
                    System.out.println("Education: " + studentEdu);
                    System.out.println("Job: " + studentJob);
                    System.out.println("-------------------");
                }
            }else if(choice==5){
                System.out.println("GoodBye");
            }else{
                System.out.println("Invalid choice");
            }
            
        con.close();
       
        }
    }
    
}
