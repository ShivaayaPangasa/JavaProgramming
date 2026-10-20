package Module5.Annotations.Q25_AnnotationArrays;

import java.lang.annotation.*;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info { String[] tags(); }

@Info(tags = {"java", "annotations", "maven"})
class Example { }

public class Main {
    public static void main(String[] args) {
        Info info = Example.class.getAnnotation(Info.class);
        System.out.println(Arrays.toString(info.tags()));
    }
}