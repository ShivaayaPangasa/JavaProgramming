package PracticalFile.Q09_RetryAnnotationReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        UnreliableService service = new UnreliableService();

        try {
            invokeWithRetry(service, "unstableOperation");
        } catch (Exception ex) {
            System.out.println(
                "All attempts failed. Final exception: "
                + ex.getMessage()
            );
        }
    }

    public static Object invokeWithRetry(
            Object target,
            String methodName
    ) throws Exception {

        // Find the method by its name using reflection.
        Method method = target.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);

        // Read the annotation at runtime.
        Retry retryInfo = method.getAnnotation(Retry.class);

        int maxAttempts =
            (retryInfo == null) ? 1 : retryInfo.times();

        Throwable lastFailure = null;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                System.out.println(
                    "Attempt " + attempt + " of " + maxAttempts
                );

                return method.invoke(target);

            } catch (InvocationTargetException wrapped) {
                // Reflection wraps the actual exception.
                lastFailure = wrapped.getCause();

                System.out.println(
                    "Attempt failed: " + lastFailure.getMessage()
                );

                if (attempt == maxAttempts) {
                    if (lastFailure instanceof Exception) {
                        throw (Exception) lastFailure;
                    }

                    if (lastFailure instanceof Error) {
                        throw (Error) lastFailure;
                    }

                    throw new RuntimeException(lastFailure);
                }
            }
        }

        throw new IllegalStateException(
            "Retry loop ended unexpectedly", lastFailure
        );
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Retry {
    int times() default 3;
}

class UnreliableService {
    @Retry(times = 3)
    public void unstableOperation() {
        // Randomly fails about 70% of the time.
        if (Math.random() < 0.7) {
            throw new IllegalStateException(
                "Random failure occurred"
            );
        }

        System.out.println("The operation succeeded!");
    }
}