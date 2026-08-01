public class Assignment3 {
    public static void main(String[] args) {
        UniversityRecordManager manager = new UniversityRecordManager();
        
        // Creating a student object
        Student s1 = new Student(101, "Amit Kumar", 9.2, "mypassword123");

        try {
            System.out.println("Checking data...");
            manager.validate(s1);
            
            System.out.println("Saving data...");
            manager.saveRecord(s1);

            System.out.println("Reading data back from file...");
            Student loaded = manager.loadRecord(101);
            
            System.out.println("Loaded Student Data: " + loaded);
            System.out.println("(Note: Password will be null because it was transient)");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Original Cause: " + e.getCause());
            }
        }
    }
}
