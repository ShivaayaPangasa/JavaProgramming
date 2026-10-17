package Module5.Annotations.Q06_TypeOfMetaAnnotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// ==========================================
// 1. CREATING A CUSTOM ANNOTATION WITH META-ANNOTATIONS
// ==========================================

@Retention(RetentionPolicy.RUNTIME) // Makes this tag readable while the app runs
@Target(ElementType.METHOD)         // Restricts this tag so it can ONLY be used on methods
@Documented                         // Makes sure this tag shows up in JavaDoc documentation
@Inherited                          // Allows child classes to inherit this tag from parent classes
@interface SmartTask {
    String priority() default "LOW";
}

// ==========================================
// 2. USING THE CUSTOM ANNOTATION
// ==========================================

class DeveloperTools {

    @SmartTask(priority = "HIGH") // Valid: Applied to a method
    public void compileCode() {
        System.out.println("Compiling project files");
    }

    // @SmartTask 
    // int bugCount = 0; 
    // ERROR - Un-commenting line above causes a compiler error because @Target blocks fields.
}

// ==========================================
// 3. TESTING AND READING THE BEHAVIOR
// ==========================================

public class Main {
    public static void main(String[] args) throws Exception {
        // Check if the method has our meta-configured annotation
        java.lang.reflect.Method method = DeveloperTools.class.getMethod("compileCode");
        
        if (method.isAnnotationPresent(SmartTask.class)) {
            SmartTask task = method.getAnnotation(SmartTask.class);
            System.out.println("Found @SmartTask on method");
            System.out.println("Task Priority: " + task.priority());
        }
    }
}

/* The five main meta-annotations used to define Java annotations are:

1. @Target — Specifies where an annotation can be applied, such as a class, method, field, or constructor.
2. @Retention — Specifies how long an annotation is retained.
3. @Documented — Indicates that an annotation should be included in generated Java documentation.
4. @Inherited — Allows an annotation on a class to be inherited by its subclasses, subject to the annotation's rules.
5. @Repeatable — Allows the same annotation to be applied multiple times to one program element.

Java also provides other predefined annotations, such as @Native, which is used with fields whose values are referenced
 by native code. It is not generally classified as one of the five main meta-annotations above. */