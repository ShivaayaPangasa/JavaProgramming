package Module5.Annotations.Q09_CustomAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String value();
}

@Author("Shivaaya Pangasa")
class Report { }

public class Main {
    public static void main(String[] args) {
        Author author = Report.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.value());
    }
}

/* A custom annotation is created using the @interface keyword. Its elements are declared like methods
 and can have default values.
*/