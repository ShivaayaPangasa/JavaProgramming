package Module5.PracticeExercise.Q01_AnnotationValidation;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.ConstraintViolation;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import java.util.Set;

public class Main {

    static class UserInput {

        @NotBlank(message = "Name cannot be empty")
        String name;

        @NotBlank(message = "Email cannot be empty")
        @Email(message = "Enter a valid email address")
        String email;

        @Min(value = 18, message = "Age must be at least 18")
        @Max(value = 100, message = "Age cannot exceed 100")
        int age;

        UserInput(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        UserInput user = new UserInput(
            "",
            "invalid-email",
            15
        );

        ValidatorFactory factory = Validation
            .byDefaultProvider()
            .configure()
            .messageInterpolator(
                new ParameterMessageInterpolator()
            )
            .buildValidatorFactory();

        Validator validator = factory.getValidator();

        Set<ConstraintViolation<UserInput>> errors =
            validator.validate(user);

        if (errors.isEmpty()) {
            System.out.println("All user inputs are valid.");
        } else {
            System.out.println("Validation errors:");

            for (ConstraintViolation<UserInput> error : errors) {
                System.out.println(
                    error.getPropertyPath() + ": "
                    + error.getMessage()
                );
            }
        }

        factory.close();
    }
}
