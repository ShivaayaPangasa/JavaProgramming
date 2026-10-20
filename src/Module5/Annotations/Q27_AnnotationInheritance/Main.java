package Module5.Annotations.Q27_AnnotationInheritance;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// First custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface AuthorInfo {
    String name();
}

// Second custom annotation containing AuthorInfo
@Retention(RetentionPolicy.RUNTIME)
@interface ProjectInfo {
    String projectName();

    // An annotation type is allowed as an element type.
    AuthorInfo author();
}

// Using both custom annotations
@ProjectInfo(
    projectName = "Java Assignment",
    author = @AuthorInfo(name = "Shivaaya")
)
public class Main {

    public static void main(String[] args) {

        // Read ProjectInfo using reflection
        ProjectInfo info =
            Main.class.getAnnotation(ProjectInfo.class);

        System.out.println("Project: " + info.projectName());
        System.out.println("Author: " + info.author().name());
    }
}

/*
No, a custom annotation cannot explicitly extend another annotation in Java. Annotation types are declared 
using the @interface keyword, and every annotation type implicitly extends the java.lang.annotation.Annotation 
interface. Java does not allow an annotation type to use an extends clause to inherit another annotation's elements.
For example, declaring @interface Child extends Parent is invalid and causes a compilation error.
However, one annotation can contain another annotation as an element type. This allows related annotation information
to be grouped together without inheritance.
Therefore, custom annotations cannot extend other annotations, but they can refer to other annotation types as elements.
*/