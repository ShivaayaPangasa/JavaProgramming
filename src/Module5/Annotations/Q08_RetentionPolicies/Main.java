package Module5.Annotations.Q08_RetentionPolicies;

import java.lang.annotation.*;

public class Main {
    @SourceNote
    @ClassNote
    @RuntimeNote
    static class Sample { }

    public static void main(String[] args) {
        Class<Sample> type = Sample.class;
        System.out.println("SOURCE visible by reflection: " + type.isAnnotationPresent(SourceNote.class));
        System.out.println("CLASS visible by reflection: " + type.isAnnotationPresent(ClassNote.class));
        System.out.println("RUNTIME visible by reflection: " + type.isAnnotationPresent(RuntimeNote.class));
    }
}

@Retention(RetentionPolicy.SOURCE) @Target(ElementType.TYPE) @interface SourceNote { }
@Retention(RetentionPolicy.CLASS) @Target(ElementType.TYPE) @interface ClassNote { }
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) @interface RuntimeNote { }

/* 
A retention policy determines how long an annotation is retained by Java tools and the compiled program. Java has three retention policies:
1. SOURCE — The annotation is available only in source code and is discarded by the compiler when creating the class file.
2. CLASS — The annotation is stored in the compiled class file but is not required to be available through runtime reflection. This is the default retention policy when @Retention is omitted.
3. RUNTIME — The annotation is stored in the class file and is available at runtime through reflection.
*/