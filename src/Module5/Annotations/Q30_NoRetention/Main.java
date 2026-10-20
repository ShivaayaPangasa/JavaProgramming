package Module5.Annotations.Q30_NoRetention;

// Custom annotation without @Retention
@interface MyAnnotation {
    String value();
}

// Applying the annotation to a class
@MyAnnotation(value = "Hello Java")
class Sample {
}

public class Main {
    public static void main(String[] args) {

        // Try to read the annotation using reflection
        MyAnnotation annotation =
            Sample.class.getAnnotation(MyAnnotation.class);

        if (annotation == null) {
            System.out.println(
                "Annotation is not available at runtime."
            );
        } else {
            System.out.println(
                "Annotation value: " + annotation.value()
            );
        }
    }
}