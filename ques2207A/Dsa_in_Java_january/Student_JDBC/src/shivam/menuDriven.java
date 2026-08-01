package Student_JDBC.src.shivam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class menuDriven {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "24BCE10389");

        while (true) {
            System.out.println("\n1. Insert Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                // Insert Student
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                String age = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();
                System.out.print("Enter City: ");
                String city = sc.nextLine();
                System.out.print("Enter Education: ");
                String edu = sc.nextLine();
                System.out.print("Enter Job: ");
                String job = sc.nextLine();

                PreparedStatement ps1 = con.prepareStatement("INSERT INTO Student_db VALUES (?,?,?,?,?,?)");
                ps1.setString(1, name);
                ps1.setString(2, age);
                ps1.setString(3, pass);
                ps1.setString(4, city);
                ps1.setString(5, edu);
                ps1.setString(6, job);

                int i = ps1.executeUpdate();
                if (i > 0) {
                    System.out.println("Student inserted successfully");
                } else {
                    System.out.println("Insert failed");
                }

            } else if (choice == 2) {
                // Update Student
                System.out.print("Enter email to update: ");
                String email = sc.nextLine();
                System.out.print("Enter new city: ");
                String newCity = sc.nextLine();

                PreparedStatement ps2 = con.prepareStatement("UPDATE Student_db SET city=? WHERE email=?");
                ps2.setString(1, newCity);
                ps2.setString(2, email);

                int count = ps2.executeUpdate();
                if (count > 0) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("Update failed");
                }

            } else if (choice == 3) {
                // Delete Student
                System.out.print("Enter email to delete: ");
                String email = sc.nextLine();

                PreparedStatement ps3 = con.prepareStatement("DELETE FROM Student_db WHERE email=?");
                ps3.setString(1, email);

                int count = ps3.executeUpdate();
                if (count > 0) {
                    System.out.println("Delete successful");
                } else {
                    System.out.println("Delete failed");
                }

            } else if (choice == 4) {
                // View All Students
                PreparedStatement ps4 = con.prepareStatement("SELECT * FROM Student_db");
                ResultSet rs = ps4.executeQuery();

                System.out.println("\n--- All Students ---");
                while (rs.next()) {
                    String studentName = rs.getString(1);
                    String studentAge = rs.getString(2);
                    String studentPass = rs.getString(3);
                    String studentCity = rs.getString(4);
                    String studentEdu = rs.getString(5);
                    String studentJob = rs.getString(6);

                    System.out.println("Name: " + studentName);
                    System.out.println("Age: " + studentAge);
                    System.out.println("Password: " + studentPass);
                    System.out.println("City: " + studentCity);
                    System.out.println("Education: " + studentEdu);
                    System.out.println("Job: " + studentJob);
                    System.out.println("-------------------");
                }

            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        con.close();
        sc.close();
    }
}