
package Module5.Annotations.Q24_AnnotationMethodRestrictions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Enum type is allowed as an annotation element type.
enum Priority {
    LOW, MEDIUM, HIGH
}

// A custom annotation demonstrating valid annotation methods.
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {

    // String is an allowed return type.
    String name();

    // Primitive type with a default value.
    int version() default 1;

    // Enum type is allowed.
    Priority priority() default Priority.MEDIUM;

    // One-dimensional arrays of allowed types are permitted.
    String[] tags() default {};

    // Class type is allowed.
    Class<?> handler() default Object.class;
}

@TaskInfo(
    name = "Java Assignment",
    version = 2,
    priority = Priority.HIGH,
    tags = {"Java", "Annotations"},
    handler = Main.class
)
public class Main {
    public static void main(String[] args) {

        // Read the annotation using reflection.
        TaskInfo info = Main.class.getAnnotation(TaskInfo.class);

        System.out.println("Name: " + info.name());
        System.out.println("Version: " + info.version());
        System.out.println("Priority: " + info.priority());

        System.out.println("Tags:");
        for (String tag : info.tags()) {
            System.out.println(tag);
        }

        System.out.println("Handler: " + info.handler().getSimpleName());
    }
}

/*
In Java, annotation methods are also called annotation elements. They define the values that can be supplied when 
using a custom annotation. Annotation methods must follow certain rules.
1. No parameters: Annotation methods cannot accept arguments.
2. No throws clause: Annotation methods cannot declare checked or unchecked exceptions using throws.
3. Restricted return types: They can return only primitive types (int, boolean, etc.), String, Class (including 
parameterized Class types), enum types, annotation types, or one-dimensional arrays of these permitted types.
4. No void return type: An annotation method must return an allowed type.
5. No method body: Annotation methods declare elements; they do not contain normal method implementations.
6. No generic methods: Annotation elements cannot declare their own type parameters.
7. Default values are optional: An element can specify a default value using the default keyword. If it has no 
default, its value must be provided when the annotation is used.
For example, String name(); is valid, and int version() default 1; is valid. However, List<String> names();, 
void display();, and String name(int id); are invalid annotation element declarations.
*/