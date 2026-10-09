package Module4.Concurrency.Q02_VectorThreads;

// Multiple threads safely add to Vector

import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Vector<Integer> values = new Vector<>();
        Runnable task = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) values.add(i);
            }
        };
        Thread t1 = new Thread(task); Thread t2 = new Thread(task); Thread t3 = new Thread(task);
        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join(); // Wait until all additions finish.
        System.out.println("Expected size=3000; actual size=" + values.size());
    }
}