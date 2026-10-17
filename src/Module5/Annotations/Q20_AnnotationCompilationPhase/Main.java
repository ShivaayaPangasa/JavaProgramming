package Module5.Annotations.Q20_AnnotationCompilationPhase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

// ==========================================
// 1. DEFINE THE COMPUTE-TIME ANNOTATION
// ==========================================
@Retention(RetentionPolicy.SOURCE) // Only needed during compilation, dropped after
@Target(ElementType.TYPE)
@interface AutoGenerateConfig {
    String className();
}

// ==========================================
// 2. THE COMPILER PROCESSOR (Runs during compilation)
// ==========================================
@SupportedAnnotationTypes("AutoGenerateConfig")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
class ConfigProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // Find every class marked with @AutoGenerateConfig
        for (Element element : roundEnv.getElementsAnnotatedWith(AutoGenerateConfig.class)) {
            AutoGenerateConfig anno = element.getAnnotation(AutoGenerateConfig.class);
            String targetName = anno.className();
            
            System.out.println("COMPILER ACTION - Found @AutoGenerateConfig on: " + element.getSimpleName());
            System.out.println("COMPILER ACTION - Generating new source file: " + targetName + ".java");
            
            // Simulating the creation of a new helper configuration file during build time
            try {
                System.out.println("--> Successfully generated helper class for " + targetName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true; // Mentions that these annotations are handled
    }
}

// ==========================================
// 3. APPLY THE ANNOTATION TO YOUR SOURCE CODE
// ==========================================
@AutoGenerateConfig(className = "DatabaseConfigHelper")
class DatabaseSettings {
    // The compiler reads the tag above before the app ever runs!
}

// ==========================================
// 4. MAIN SIMULATION FOR TESTING
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Build/Compilation Phase --- \n");
        
        // Simulating what the javac compiler tool does under the hood
        ConfigProcessor processor = new ConfigProcessor();
        
        // In a real build, the compiler executes the processor automatically.
        // We simulate a mock processing environment call here:
        System.out.println("Executing compiler plugin loops");
        System.out.println("COMPILER ACTION - Scanning source files");
        
        // Mock output representing what happens during the compilation step
        System.out.println("COMPILER ACTION - Found @AutoGenerateConfig on: DatabaseSettings");
        System.out.println("COMPILER ACTION - Generating new source file: DatabaseConfigHelper.java");
        System.out.println("--> Successfully generated helper class for DatabaseConfigHelper");

        System.out.println("\n--- Compilation Finished, Bytecode generated. ---");
    }
}

/*
During compilation, the Java compiler checks Java source code and processes annotations according to their purpose. 
Some built-in annotations, such as @Override, help the compiler detect errors. Annotation processors can inspect 
annotations during compilation and generate additional source files or other resources, or report errors.
The retention policy determines whether the annotation remains only in source code, is stored in the compiled class 
file, or is also available at runtime.
For example, @Retention(RetentionPolicy.SOURCE) annotations are discarded after compilation, while 
@Retention(RetentionPolicy.CLASS) annotations are stored in the compiled class file. 
Annotations marked with @Retention(RetentionPolicy.RUNTIME) can additionally be inspected at runtime using reflection.
*/