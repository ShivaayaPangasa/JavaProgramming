package Module5.Annotations.Q14_MarkerSpringHibernate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// ==========================================
// 1. FRAMEWORK ANNOTATIONS (Simulating Spring & Hibernate)
// ==========================================

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Can only be applied to Classes
@interface SimulatedEntity {
    String tableName(); // Hibernate style: Maps class to a database table
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SimulatedComponent {
    String beanName(); // Spring style: Registers object in the system framework
}

// ==========================================
// 2. YOUR APPLICATION CODE (Using the tags)
// ==========================================

@SimulatedEntity(tableName = "users_table")
@SimulatedComponent(beanName = "userRepository")
class UserModule {
    // Your standard application logic goes here
}

// ==========================================
// 3. THE FRAMEWORK ENGINE (How Spring/Hibernate process them)
// ==========================================

public class Main {
    public static void main(String[] args) {
        // Frameworks automatically scan your packages. Let's inspect UserModule:
        Class<UserModule> scannedClass = UserModule.class;

        System.out.println("--- Booting Framework Engine --- \n");

        // Simulating Hibernate behavior: Mapping to Database
        if (scannedClass.isAnnotationPresent(SimulatedEntity.class)) {
            SimulatedEntity entity = scannedClass.getAnnotation(SimulatedEntity.class);
            System.out.println("HIBERNATE Mapping Class '" + scannedClass.getSimpleName() 
                               + "' to Database Table: [" + entity.tableName() + "]");
        }

        // Simulating Spring behavior: Managing Objects
        if (scannedClass.isAnnotationPresent(SimulatedComponent.class)) {
            SimulatedComponent component = scannedClass.getAnnotation(SimulatedComponent.class);
            System.out.println("SPRING Instantiating object and registering bean as: '" 
                               + component.beanName() + "'");
        }
        
        System.out.println("\n--- Framework Boot Completed Successfully ---");
    }
}

/* 
Frameworks such as Spring and Hibernate use annotations to configure applications and describe how classes, methods
and fields should be processed.

In Spring, annotations such as @Component, @Service, and @RestController help identify components and define
application behaviour. Depending on the configuration, Spring processes these annotations to create objects and handle
web requests.

In Hibernate, annotations such as @Entity, @Id, and @Column describe how Java classes and fields map to database tables
and columns. Annotations reduce the need for extensive XML configuration and make application code easier to configure
and maintain.
*/