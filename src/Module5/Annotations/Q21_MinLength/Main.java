package Module5.Annotations.Q21_MinLength;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@interface MinLength { int value(); }

class User {
    @MinLength(3)
    String username = "Shivaaya";

    @MinLength(5)
    String password = "cat";
}

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        boolean allValid = true;
        for (Field field : User.class.getDeclaredFields()) {
            MinLength rule = field.getAnnotation(MinLength.class);
            if (rule == null) continue;
            field.setAccessible(true);
            String value = (String) field.get(user);
            boolean valid = value != null && value.length() >= rule.value();
            System.out.println(field.getName() + " => " + (valid ? "valid" : "invalid"));
            if (!valid) {
                allValid = false;
                System.out.println("  Minimum required length: " + rule.value());
            }
        }
        System.out.println("All fields valid: " + allValid);
    }
}