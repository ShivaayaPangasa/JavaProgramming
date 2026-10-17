package Module5.Annotations.Q05_MetaAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// 1. DEFINE THE ANNOTATION (The Tag)
@Retention(RetentionPolicy.RUNTIME) // Keeps tag available while program runs
@interface MyMetadata {
    String author();
    String date() default "2026-01-01"; // Optional with a default value
}

// 2. APPLY THE ANNOTATION (Using the Tag)
@MyMetadata(author = "Shivaaya", date = "2026-10-16")
class ProjectModule {

    @MyMetadata(author = "Vaaya") // Uses the default date
    public void executeTask() {
        System.out.println("Task is executing...");
    }
}

// 3. READ THE ANNOTATION (Checking the Tag)
public class Main {
    public static void main(String[] args) throws Exception {
        
        // Read Class Metadata
        Class<ProjectModule> obj = ProjectModule.class;
        if (obj.isAnnotationPresent(MyMetadata.class)) {
            MyMetadata classMeta = obj.getAnnotation(MyMetadata.class);
            System.out.println("Class Author: " + classMeta.author());
            System.out.println("Class Date: " + classMeta.date());
        }

        System.out.println("-------------------");

        // Read Method Metadata
        Method method = obj.getMethod("executeTask");
        if (method.isAnnotationPresent(MyMetadata.class)) {
            MyMetadata methodMeta = method.getAnnotation(MyMetadata.class);
            System.out.println("Method Author: " + methodMeta.author());
            System.out.println("Method Date: " + methodMeta.date());
        }
    }
}

/* Meta-annotations are annotations that provide information about other annotations. They are used to define how a custom annotation should behave, where it can be applied, and how long it should be retained.
For example, @Retention specifies whether an annotation is retained only in source code, in the compiled class file, or at runtime.
Meta-annotations are especially useful when creating custom annotations. */