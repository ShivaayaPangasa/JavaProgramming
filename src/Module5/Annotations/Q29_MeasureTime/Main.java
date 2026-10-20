package Module5.Annotations.Q29_MeasureTime;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime { }

class Worker {
    @LogExecutionTime
    public void doWork() throws InterruptedException {
        long total = 0;
        for (int i = 0; i < 100_000; i++) total += i;
        if (total < 0) System.out.println(total);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Worker worker = new Worker();
        Method method = Worker.class.getMethod("doWork");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            try {
                method.invoke(worker);
            } finally {
                long elapsed = System.nanoTime() - start;
                System.out.println("doWork took " + elapsed + " ns");
            }
        }
    }
}
