package Module5.Annotations.Q12_ReflectionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Course {
    String name();
}

@Course(name = "Java Programming")
class Student {
}

public class Main {
    public static void main(String[] args) {

        Course course =
            Student.class.getAnnotation(Course.class);

        if (course != null) {
            System.out.println("Course: " + course.name());
        }
    }
}

/* 
Reflection allows a Java program to inspect classes, methods, fields and their annotations at runtime. 
The getAnnotation() method can retrieve a particular annotation, while methods such as getAnnotations() can retrieve 
annotations visible to reflection.

For reflection to read a custom annotation at runtime, it normally needs @Retention(RetentionPolicy.RUNTIME).
*/