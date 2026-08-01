// package shivam;

// import java.sql.DriverManager;
// import java.sql.Connection;
// import java.sql.SQLException;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;;
// public class fetchdata {
//     public static void main(String args[])throws SQLException,ClassNotFoundException{
//         Class.forName("com.mysql.cj.jdbc.Driver");

//         Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "24BCE10389");

//         PreparedStatement ps=con.prepareStatement("select * from Student_db");
//         ResultSet rs=ps.executeQuery();

//         while(rs.next()){
//             String name=rs.getString("name");
//             System.out.println("Name: "+name);

            
//             String email=rs.getString("email");
//             System.out.println("email: "+email);

//             String gender=rs.getString("gender");
//             System.out.println("gender: "+gender);

            
//             String pass=rs.getString("pass");
//             System.out.println("pass: "+pass);

            
//             String city=rs.getString("city");
//             System.out.println("city: "+city);

//         }

 


//     }
// }



// package shivam;
// import java.sql.Driver;
// import java.sql.DriverManager;
// import java.sql.Connection;
// import java.sql.SQLException;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;

// public class fetchdata{
//     public static void main(String args[]) throws SQLException,ClassNotFoundException{
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root","24BCE10389");
    
//         PreparedStatement ps=con.prepareStatement("select * from Student_db");
//         ResultSet rs=ps.executeQuery();
//         while(rs.next()){
//             String name=rs.getString("name");
//             System.out.println("Name: "+name);
//         }
//     }
// }

