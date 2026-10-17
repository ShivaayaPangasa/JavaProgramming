package Module5.Annotations.Q13_MarkerSingleValueAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// ==========================================
// 1. DEFINE THE ANNOTATIONS
// ==========================================

// MARKER ANNOTATION: Empty, acts as a simple flag
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerFlag { }

// SINGLE-VALUE ANNOTATION: Contains exactly one element named value()
@Retention(RetentionPolicy.RUNTIME)
@interface SingleValueInfo {
    String value(); // Must be named 'value' to use the shortcut
}

// ==========================================
// 2. APPLY THE ANNOTATIONS
// ==========================================

class JobManager {

    @MarkerFlag // No parentheses needed because it is just a marker
    public void criticalTask() {
        System.out.println("Executing a highly critical task");
    }

    @SingleValueInfo("High Priority Process") // SHORTCUT: 'value = ' is omitted!
    public void standardTask() {
        System.out.println("Executing a standard task");
    }
}

// ==========================================
// 3. READ THE ANNOTATIONS AT RUNTIME
// ==========================================

public class Main {
    public static void main(String[] args) throws Exception {
        Class<JobManager> clazz = JobManager.class;

        System.out.println("--- Reading Marker Annotation ---");
        Method method1 = clazz.getMethod("criticalTask");
        if (method1.isAnnotationPresent(MarkerFlag.class)) {
            System.out.println("criticalTask() is marked with @MarkerFlag!");
        }

        System.out.println("\n--- Reading Single-Value Annotation ---");
        Method method2 = clazz.getMethod("standardTask");
        if (method2.isAnnotationPresent(SingleValueInfo.class)) {
            SingleValueInfo info = method2.getAnnotation(SingleValueInfo.class);
            // Read data from the value() element
            System.out.println("standardTask() description: " + info.value());
        }
    }
}

/*
A marker annotation does not contain any elements. It simply indicates that a class, method, or other element
has a particular property.
Example:
@interface Important {
}

Usage:
@Important
class MyClass {
}

A single-value annotation contains one element, usually named value, which can be supplied when the annotation is used.
Example:
@interface Priority {
    int value();
}

Usage:
@Priority(5)
class Task {
}

Main difference: A marker annotation provides a label without storing values, while a single-value annotation stores
one value.
 */