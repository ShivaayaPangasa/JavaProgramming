package Module2.Q08_Custom_InvalidAgeException;

public class AgeValidator {

    public void validateAge(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above.");
        }

        System.out.println(
                "Age is valid. User is eligible.");
    }
}