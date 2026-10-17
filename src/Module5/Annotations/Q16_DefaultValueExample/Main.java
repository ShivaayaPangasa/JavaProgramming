package Module5.Annotations.Q16_DefaultValueExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface EmployeeInfo {
    String department() default "IT";
    int experience() default 1;
}

@EmployeeInfo
class Employee {
}

public class Main {
    public static void main(String[] args) {

        EmployeeInfo info =
            Employee.class.getAnnotation(EmployeeInfo.class);

        System.out.println(info.department());
        System.out.println(info.experience());
    }
}

/*
 Default values allow annotation elements to have predefined values. When an annotation is used, 
 the programmer can omit elements that have defaults. This makes annotations easier to use and reduces 
 repeated code.
 */