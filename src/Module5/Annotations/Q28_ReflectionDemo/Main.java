package Module5.Annotations.Q28_ReflectionDemo;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Description { String value(); }

@Description("A class used to demonstrate reflection")
class Sample {
    @Description("Prints a greeting")
    public void greet() { System.out.println("Hello from Sample"); }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Description classInfo = Sample.class.getAnnotation(Description.class);
        System.out.println("Class: " + classInfo.value());
        Sample sample = new Sample();
        for (Method method : Sample.class.getDeclaredMethods()) {
            Description description = method.getAnnotation(Description.class);
            if (description != null) {
                System.out.println(method.getName() + ": " + description.value());
                method.invoke(sample);
            }
        }
    }
}
