package Module5.Annotations.Q15_InheritedAnnotationExample;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Company {
    String name();
}

@Company(name = "ABC Ltd.")
class Parent {
}

class Child extends Parent {
}

public class Main {
    public static void main(String[] args) {

        Company company =
            Child.class.getAnnotation(Company.class);

        if (company != null) {
            System.out.println(company.name());
        }
    }
} 

/*
Yes, certain annotations can be inherited by subclasses when the annotation is marked with @Inherited.
This applies to class-level annotations. It does not make annotations on methods or fields inheritable.
*/