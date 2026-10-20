package Module5.Annotations.Q22_AuthorVersion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface AuthorVersion {
    String author();
    String version() default "1.0";
}

@AuthorVersion(author = "Student", version = "1.2")
class Calculator { }

public class Main {
    public static void main(String[] args) {
        AuthorVersion info = Calculator.class.getAnnotation(AuthorVersion.class);
        System.out.println("Author: " + info.author());
        System.out.println("Version: " + info.version());
    }
}
