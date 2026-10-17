package Module5.Annotations.Q10_TargetMetaAnnotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 1. DEFINE THE ANNOTATION WITH A TARGET RESTRICTION
// This tells Java that this tag can ONLY be used on methods
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) 
@interface MethodOnly {
    String description();
}

// 2. APPLYing THE ANNOTATION
class SmartDevice {

    // UN-COMMENTING THE LINES BELOW WILL CAUSE A COMPILER ERROR:
    // @MethodOnly(description = "This is a field") 
    // private String deviceName = "Smart TV";
    // Reason: ElementType.METHOD blocks this annotation from being applied to fields.

    //  VALID: Placed on a method
    @MethodOnly(description = "This method boots up the device")
    public void turnOn() {
        System.out.println("Device is now ON.");
    }
}

// 3. MAIN CLASS TO RUN THE CODE
public class Main {
    public static void main(String[] args) throws Exception {
        SmartDevice device = new SmartDevice();
        device.turnOn();
        
        // Reading the target-restricted annotation at runtime
        java.lang.reflect.Method method = SmartDevice.class.getMethod("turnOn");
        MethodOnly annotation = method.getAnnotation(MethodOnly.class);
        
        System.out.println("Successfully read annotation description: " + annotation.description());
    }
}

/* 
The @Target meta-annotation specifies the program elements on which a custom annotation can be used. It prevents the annotation from being applied to unsupported elements.
Common target values include:
- ElementType.TYPE — Classes, interfaces, enums and annotation types.
- ElementType.METHOD — Methods.
- ElementType.FIELD — Fields.
- ElementType.CONSTRUCTOR — Constructors.
- ElementType.PARAMETER — Method or constructor parameters.
- ElementType.LOCAL_VARIABLE — Local variables.
*/