package Module5.Annotations.Q23_AnnotationReflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ComponentInfo {
    String name();
    String version() default "1.0";
}

@ComponentInfo(name = "DemoComponent", version = "2.0")
class Component { }

public class Main {
    public static void main(String[] args) {
        for (Annotation annotation : Component.class.getDeclaredAnnotations()) {
            System.out.println("Annotation type: " + annotation.annotationType().getSimpleName());
            if (annotation instanceof ComponentInfo info) {
                System.out.println("Name: " + info.name());
                System.out.println("Version: " + info.version());
            }
        }
    }
}
