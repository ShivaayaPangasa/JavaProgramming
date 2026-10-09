package Module4.Concurrency.Q04_ConcurrentHashMapThreads;

/**
 * ConcurrentHashMap concurrent updates
 * Beginner note: read the explanatory comments from top to bottom.
 */
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Map<String, Integer> counts = new ConcurrentHashMap<>();
        Runnable task = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) counts.merge("visits", 1, Integer::sum);
            }
        };
        Thread a = new Thread(task); Thread b = new Thread(task);
        Thread c = new Thread(task); Thread d = new Thread(task);
        a.start(); b.start(); c.start(); d.start();
        a.join(); b.join(); c.join(); d.join();
        System.out.println("Expected visits=4000; actual=" + counts.get("visits"));
        System.out.println("ConcurrentHashMap does not allow null keys or values.");
    }
}
