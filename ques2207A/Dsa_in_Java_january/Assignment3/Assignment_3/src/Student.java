import java.io.Serializable;

// This class must be serializable to save to a file
public class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Required for serialization

    private int studentId;
    private String name;
    private double cgpa;
    private transient String password; // transient means it won't be saved in the file

    public Student(int studentId, String name, double cgpa, String password) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
        this.password = password;
    }

    // Getters to access the private data
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "Student ID: " + studentId + " | Name: " + name + " | CGPA: " + cgpa + " | Password: " + password;
    }
}