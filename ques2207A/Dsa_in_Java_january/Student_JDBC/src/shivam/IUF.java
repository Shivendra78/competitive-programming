package Student_JDBC.src.shivam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IUF {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        
        // Student data to insert
        String name = "Shivam";
        String age = "23";
        String pass = "23443";
        String city = "sdfwehfwe";
        String edu = "btech";
        String job = "null";

        // Update data
        String city2 = "pune";
        String email2 = "sh.2GMAIL.COM";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "24BCE10389");

        // 1. Insert new record
        PreparedStatement ps1 = con.prepareStatement("INSERT INTO Student_db VALUES (?,?,?,?,?,?)");
        ps1.setString(1, name);
        ps1.setString(2, age);
        ps1.setString(3, pass);
        ps1.setString(4, city);
        ps1.setString(5, edu);
        ps1.setString(6, job);

        int i = ps1.executeUpdate();
        if (i > 0) {
            System.out.println("Successfully Inserted");
        } else {
            System.out.println("Insert failed");
        }

        // 2. Update record
        PreparedStatement ps2 = con.prepareStatement("UPDATE Student_db SET city=? WHERE email=?");
        ps2.setString(1, city2);
        ps2.setString(2, email2);

        int count = ps2.executeUpdate();
        if (count > 0) {
            System.out.println("Update successful");
        } else {
            System.out.println("Update failed");
        }

        // 3. Fetch and display all records
        PreparedStatement ps3 = con.prepareStatement("SELECT * FROM Student_db");
        ResultSet rs = ps3.executeQuery();

        System.out.println("\n--- All Records ---");
        while (rs.next()) {
            String studentName = rs.getString("name");
            System.out.println("Name: " + studentName);

            String studentEmail = rs.getString("email");
            System.out.println("Email: " + studentEmail);

            String studentGender = rs.getString("gender");
            System.out.println("Gender: " + studentGender);

            String studentPass = rs.getString("pass");
            System.out.println("Pass: " + studentPass);

            String studentCity = rs.getString("city");
            System.out.println("City: " + studentCity);

            System.out.println("------------------------");
        }

        con.close();
    }
}