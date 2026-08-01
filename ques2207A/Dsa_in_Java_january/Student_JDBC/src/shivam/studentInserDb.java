// package shivam;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.PreparedStatement;

// public class studentInserDb {
//     public static void main(String args[]) throws ClassNotFoundException, SQLException{

//         // User data variables
//         String name="Shivam";
//         String age="12";
//         String email="shivam.45@gmail.com";
//         String gender="male";
//         String pass="123456";
//         String city="Salempur";

//         // Load MySQL JDBC driver
//         Class.forName("com.mysql.cj.jdbc.Driver");
        
//         // Establish database connection
//         Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","24BCE10389");
        
//         // Create PreparedStatement with 6 placeholders to match 6 parameters
//         PreparedStatement ps=con.prepareStatement("insert into student_db values(?,?,?,?,?,?)");

//         // Set all 6 parameters
//         ps.setString(1,name);    // Parameter 1: name
//         ps.setString(2, age);    // Parameter 2: age
//         ps.setString(3, email);  // Parameter 3: email
//         ps.setString(4, gender); // Parameter 4: gender
//         ps.setString(5, pass);   // Parameter 5: password
//         ps.setString(6, city);   // Parameter 6: city

//         // Execute the INSERT statement
//         int i = ps.executeUpdate();
        
//         // Check if insertion was successful
//         if(i>0){
//             System.out.println("Executed Successfully");
//         }else{
//             System.out.println("Failed");
//         }

//         // Close database connection
//         con.close();
//     }
// }

// /*
//  * FIXES APPLIED:
//  * 
//  * 1. Added 6th placeholder (?) to the SQL INSERT statement
//  *    - Original: "insert into register values(?,?,?,?,?)" (5 placeholders)
//  *    - Fixed: "insert into register values(?,?,?,?,?,?)" (6 placeholders)
//  * 
//  * 2. MySQL JDBC Driver Issue:
//  *    - Make sure mysql-connector-java JAR is in your classpath
//  *    - Download from: https://dev.mysql.com/downloads/connector/j/
//  *    - Or use Maven/Gradle dependency management
//  * 
//  * NOTE: Your database table 'register' should have 6 columns to match 6 values:
//  * Likely structure: name, age, email, gender, password, city
//  */
    

package shivam;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentInserDb{
    public static void main(String args[]) throws SQLException,ClassNotFoundException{
          String name1="Shivendra";
          String age1="10";
          String email1="shivendra.45@gmail.com";
          String gender1="male";
          String pass1="123456";
          String city1="Salempur";
        
          Class.forName("com.mysql.cj.jdbc.Driver");

          Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root", "24BCE10389");

          PreparedStatement ps=con.prepareStatement("insert into student_db values(?,?,?,?,?,?)");

          ps.setString(1, name1);
          ps.setString(2, age1);
          ps.setString(3, email1);
          ps.setString(4, gender1);
          ps.setString(5, pass1);
          ps.setString(6, city1);

          int i=ps.executeUpdate();
          if(i>0){
            System.out.println("Succesfully executed");
          }else{
            System.out.println("Not ex");
          }
          con.close();
    }
}