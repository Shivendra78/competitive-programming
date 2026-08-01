package shivam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insertANDFetch {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        
        // Student data to insert
        String name = "Shivam";
        String age = "23";
        String pass = "23443";
        String city = "sdfwehfwe";
        String edu = "btech";
        String job = "null";

        // Database connection details
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String username = "root";
        String password = "24BCE10389";

        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Use try-with-resources for proper resource management
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            
            // Insert new student record
            String insertSQL = "INSERT INTO Student_db VALUES (?,?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {
                ps.setString(1, name);
                ps.setString(2, age);
                ps.setString(3, pass);
                ps.setString(4, city);
                ps.setString(5, edu);
                ps.setString(6, job);

                int i = ps.executeUpdate();
                if (i > 0) {
                    System.out.println("Successfully Executed - Record Inserted");
                } else {
                    System.out.println("Insert operation failed");
                }
            }

            // Now retrieve and display all records (including the newly inserted one)
            String selectSQL = "SELECT * FROM Student_db";
            try (PreparedStatement fd = con.prepareStatement(selectSQL);
                 ResultSet rs = fd.executeQuery()) {
                
                System.out.println("\n--- All Student Records ---");
                while (rs.next()) {
                    // Use different variable names to avoid conflicts
                    String studentName = rs.getString(1);  // or rs.getString("name") if column name is "name"
                    String studentAge = rs.getString(2);   // or rs.getString("age") if column name is "age"
                    String studentPass = rs.getString(3);  // or rs.getString("pass") if column name is "pass"
                    String studentCity = rs.getString(4);  // or rs.getString("city") if column name is "city"
                    String studentEdu = rs.getString(5);   // or rs.getString("edu") if column name is "edu"
                    String studentJob = rs.getString(6);   // or rs.getString("job") if column name is "job"
                    
                    System.out.println("Name: " + studentName);
                    System.out.println("Age: " + studentAge);
                    System.out.println("Pass: " + studentPass);
                    System.out.println("City: " + studentCity);
                    System.out.println("Education: " + studentEdu);
                    System.out.println("Job: " + studentJob);
                    System.out.println("------------------------");
                }
            }
            
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}