package Module2.Q09_Custom_exception_with_file_logging;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}