package Module2.Q09_Custom_exception_with_file_logging;

public class AgeValidator {

    public void validateAge(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "Invalid age: " + age
                            + ". Age must be 18 or above.");
        }

        System.out.println(
                "Age is valid. User is eligible.");
    }
}