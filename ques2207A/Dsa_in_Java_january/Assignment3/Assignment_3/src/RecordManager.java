import java.io.*;

interface RecordManager {
    void saveRecord(Student s) throws RecordSaveException;
    Student loadRecord(int studentId) throws RecordLoadException;
    void validate(Student s) throws InvalidRecordException;
}

class UniversityRecordManager implements RecordManager {

    @Override
    public void validate(Student s) throws InvalidRecordException {
        if (s.getStudentId() <= 0) {
            throw new InvalidRecordException("ID cannot be negative!");
        }
        if (s.getCgpa() < 0 || s.getCgpa() > 10) {
            throw new InvalidRecordException("CGPA must be between 0 and 10.");
        }
    }

    @Override
    public void saveRecord(Student s) throws RecordSaveException {
        String fileName = s.getStudentId() + "_record.ser";
        // try-with-resources closes the file automatically
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(s);
            System.out.println("Student " + s.getStudentId() + " saved to file.");
        } catch (IOException e) {
            throw new RecordSaveException("Could not save the student record", e);
        }
    }

    @Override
    public Student loadRecord(int studentId) throws RecordLoadException {
        String fileName = studentId + "_record.ser";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Student) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Exception chaining: keeping the original 'e' cause
            throw new RecordLoadException("Could not load student record or file is corrupted", e);
        }
    }
}