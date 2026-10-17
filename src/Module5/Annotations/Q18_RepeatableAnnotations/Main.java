package Module5.Annotations.Q18_RepeatableAnnotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Authors.class)
@interface Author {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Authors {
    Author[] value();
}

@Author("Shivaaya")
@Author("Pangasa")
class Project {
}

public class Main {
    public static void main(String[] args) {

        Author[] authors =
            Project.class.getAnnotationsByType(Author.class);

        for (Author author : authors) {
            System.out.println(author.value());
        }
    }
}

// Repeatable annotations allow the same annotation to be applied multiple times to a single program element. 
// They were introduced in Java 8. The @Repeatable meta-annotation specifies the container annotation that holds 
// repeated instances.