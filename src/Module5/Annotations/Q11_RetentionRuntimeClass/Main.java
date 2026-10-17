package Module5.Annotations.Q11_RetentionRuntimeClass;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 1. DEFINE A RUNTIME ANNOTATION
@Retention(RetentionPolicy.RUNTIME) // Stays alive at runtime
@interface RuntimeTag {
    String value();
}

// 2. DEFINE A CLASS ANNOTATION
@Retention(RetentionPolicy.CLASS) // Dropped at runtime (default behavior)
@interface ClassTag {
    String value();
}

// 3. APPLY BOTH ANNOTATIONS TO A CLASS
@RuntimeTag("I am visible at runtime")
@ClassTag("I am invisible at runtime")
class DemoService {
    // This class just holds the tags for testing
}

// 4. TEST THE VISIBILITY AT RUNTIME
public class Main {
    public static void main(String[] args) {
        Class<DemoService> demoClass = DemoService.class;

        System.out.println("--- Testing Annotation Retention ---\n");

        // Try to read the RUNTIME annotation
        if (demoClass.isAnnotationPresent(RuntimeTag.class)) {
            RuntimeTag runtimeAnno = demoClass.getAnnotation(RuntimeTag.class);
            System.out.println("FOUND @RuntimeTag: " + runtimeAnno.value());
        } else {
            System.out.println("LOST @RuntimeTag is missing");
        }

        // Try to read the CLASS annotation
        if (demoClass.isAnnotationPresent(ClassTag.class)) {
            ClassTag classAnno = demoClass.getAnnotation(ClassTag.class);
            System.out.println("FOUND @ClassTag: " + classAnno.value());
        } else {
            System.out.println("LOST @ClassTag is missing! (It was discarded when the app started)");
        }
    }
}

/*
RetentionPolicy.CLASS stores an annotation in the compiled class file, but the annotation is not required to be
available through runtime reflection.

RetentionPolicy.RUNTIME also stores the annotation in the class file and makes it available to reflection when
the class is loaded.

Main difference: Use CLASS when the annotation is needed in the compiled class file but not necessarily at runtime.
Use RUNTIME when a program or framework must inspect the annotation while the program is running.
*/