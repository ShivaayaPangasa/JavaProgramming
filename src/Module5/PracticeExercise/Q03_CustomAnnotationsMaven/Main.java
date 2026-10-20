package Module5.PracticeExercise.Q03_CustomAnnotationsMaven;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;

// Creating a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface CourseInfo {
    String courseName();
    String instructor() default "Not Assigned";
}

// Applying the custom annotation
@CourseInfo(
    courseName = "Core Java",
    instructor = "Java Faculty"
)
public class Main {

    public static void main(String[] args) throws Exception {

        // Using a method from the Maven dependency
        String studentName = "alex";

        System.out.println(
            "Student: " + StringUtils.capitalize(studentName)
        );

        // Reading the custom annotation using reflection
        CourseInfo info = Main.class.getAnnotation(CourseInfo.class);

        System.out.println("Course: " + info.courseName());
        System.out.println("Instructor: " + info.instructor());

        // Creating another custom annotation on a method
        Method method = Main.class.getMethod("displayMessage");

        if (method.isAnnotationPresent(CourseInfo.class)) {
            System.out.println("Annotation found on method.");
        } else {
            System.out.println("No CourseInfo annotation on method.");
        }
    }

    public static void displayMessage() {
        System.out.println("Learning custom annotations.");
    }
}
