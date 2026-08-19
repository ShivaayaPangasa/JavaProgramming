package Module2.Q08_Custom_InvalidAgeException;

public class Main {

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(16);
        } catch (InvalidAgeException exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }
    }
}