package Module5.Annotations.Q19_DocumentedMetaAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// ==========================================
// 1. DEFINE TWO CUSTOM ANNOTATIONS
// ==========================================

// This annotation WILL show up in JavaDoc documentation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface DocumentedTag {
    String value();
}

// This annotation WILL NOT show up in JavaDoc documentation
@Retention(RetentionPolicy.RUNTIME)
@interface HiddenTag {
    String value();
}

// ==========================================
// 2. APPLY THE ANNOTATIONS
// ==========================================

@DocumentedTag("Visible in JavaDoc")
@HiddenTag("Invisible in JavaDoc")
class AccountService {
    // Business logic goes here
}

// ==========================================
// 3. HOW THE JAVADOC TOOL CHECKS THE FLAG
// ==========================================

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Simulating JavaDoc Tool Engine ---\n");

        Class<AccountService> clazz = AccountService.class;

        // Check the visible tag
        if (clazz.isAnnotationPresent(DocumentedTag.class)) {
            boolean isDoc = DocumentedTag.class.isAnnotationPresent(Documented.class);
            System.out.println("Tag: @DocumentedTag");
            System.out.println("-> Has @Documented flag? " + isDoc);
            System.out.println("-> ACTION - The JavaDoc tool WILL write this tag into the HTML page.\n");
        }

        // Check the hidden tag
        if (clazz.isAnnotationPresent(HiddenTag.class)) {
            boolean isDoc = HiddenTag.class.isAnnotationPresent(Documented.class);
            System.out.println("Tag: @HiddenTag");
            System.out.println("-> Has @Documented flag? " + isDoc);
            System.out.println("-> ACTION - The JavaDoc tool WILL HIDE this tag from the HTML page.");
        }
    }
}

/* 
The @Documented meta-annotation tells Java that your custom annotation should be included in the generated 
JavaDoc documentation.
By default, custom annotations are hidden from JavaDoc. Adding @Documented ensures that anyone reading the 
official documentation for your class will explicitly see that the annotation is being used */ 