package Module5.Annotations.Q17_StringLengthValidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
}

class User {
    @MinLength(3)
    String name = "Al";
}

public class Main {
    public static void main(String[] args)
            throws IllegalAccessException {

        User user = new User();

        try {
            Field field = User.class.getDeclaredField("name");
            MinLength annotation =
                field.getAnnotation(MinLength.class);

            if (annotation != null) {
                String value = (String) field.get(user);

                if (value.length() < annotation.value()) {
                    System.out.println(
                        "Invalid: minimum length is "
                        + annotation.value()
                    );
                } else {
                    System.out.println("Valid string");
                }
            }
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found");
        }
    }
}

// We can create a custom annotation named @MinLength to specify the minimum permitted string length.
// We can then use reflection to read the annotation and validate the string.
// Here, @MinLength(3) specifies that the string must contain at least three characters. 
// The program reads the annotation through reflection and checks the field's value.