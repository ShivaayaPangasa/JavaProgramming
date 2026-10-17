package Module5.Annotations.Q07_AnnotationsAffectRuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// 1. CREATE THE ANNOTATION
// We use RUNTIME retention so the program can read this tag while it is running.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExecuteAtRuntime {
    String message() default "Running marked method";
}

// 2. CREATE A CLASS WITH BOTH MARKED AND UNMARKED METHODS
class AppFeatures {

    @ExecuteAtRuntime(message = "Initializing the Database")
    public void startDatabase() {
        System.out.println("-> Database connected successfully");
    }

    public void secretBackup() {
        System.out.println("-> This should NOT run automatically");
    }

    @ExecuteAtRuntime(message = "Loading User Interface")
    public void launchUI() {
        System.out.println("-> UI loaded successfully");
    }
}

// 3. THE RUNTIME ENGINE (Changes behavior based on annotations)
public class Main {
    public static void main(String[] args) {
        AppFeatures features = new AppFeatures();
        
        // Get all methods inside the AppFeatures class
        Method[] methods = AppFeatures.class.getDeclaredMethods();

        System.out.println("--- Starting Runtime Automation ---");

        for (Method method : methods) {
            // Check if the method has our special runtime tag
            if (method.isAnnotationPresent(ExecuteAtRuntime.class)) {
                
                // Read the custom message from the annotation
                ExecuteAtRuntime annotation = method.getAnnotation(ExecuteAtRuntime.class);
                System.out.println("\nTrigger - " + annotation.message());

                try {
                    // Dynamically execute the method
                    method.invoke(features);
                } catch (Exception e) {
                    System.out.println("Failed to run method: " + method.getName());
                }
            }
        }
        System.out.println("\n--- Automation Finished ---");
    }
}

/* 
Annotations can affect runtime behaviour when they are retained at runtime using @Retention(RetentionPolicy.RUNTIME)
and are processed by reflection, frameworks or other application code.
For example, a framework may read an annotation to determine which method should handle a web request, which field 
should map to a database column or which method should be executed for a particular task.
However, annotations do not perform actions automatically. Some code or framework must read and interpret them.
*/