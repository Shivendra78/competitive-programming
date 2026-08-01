// Custom exception for validation errors
class InvalidRecordException extends Exception {
    public InvalidRecordException(String message) {
        super(message);
    }
}

// Custom exception for saving errors
class RecordSaveException extends Exception {
    public RecordSaveException(String message, Throwable cause) {
        super(message, cause); // This is the exception chaining part
    }
}

// Custom exception for loading errors
class RecordLoadException extends Exception {
    public RecordLoadException(String message, Throwable cause) {
        super(message, cause); // This is the exception chaining part
    }
}