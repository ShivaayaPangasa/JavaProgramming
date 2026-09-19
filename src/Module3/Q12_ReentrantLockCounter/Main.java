package Module3.Q12_ReentrantLockCounter;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final int THREADS = 4;

    private static final int INCREMENTS_PER_THREAD = 1_000_000;

    // Runs the supplied increment operation using four threads.
    private static void runThreads(Runnable incrementAction)
            throws InterruptedException {

        Thread[] threads = new Thread[THREADS];

        for (int index = 0; index < THREADS; index++) {
            threads[index] = new Thread(() -> {
                for (
                        int count = 0;
                        count < INCREMENTS_PER_THREAD;
                        count++
                ) {
                    incrementAction.run();
                }
            });

            threads[index].start();
        }

        // Wait for every worker.
        for (Thread thread : threads) {
            thread.join();
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        UnsafeCounter unsafeCounter = new UnsafeCounter();

        // Method reference means: call unsafeCounter.increment().
        runThreads(unsafeCounter::increment);

        SafeCounter safeCounter = new SafeCounter();
        runThreads(safeCounter::increment);

        int expected = THREADS * INCREMENTS_PER_THREAD;

        System.out.println("Expected count: " + expected);
        System.out.println(
                "Without lock:  " + unsafeCounter.getCount()
        );
        System.out.println(
                "With lock:     " + safeCounter.getCount()
        );
    }
}

class UnsafeCounter {
    private int count = 0;

    public void increment() {
        // Read-modify-write operation; not atomic.
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SafeCounter {
    private int count = 0;

    private final ReentrantLock lock =
            new ReentrantLock();

    public void increment() {
        lock.lock();

        try {
            count++;
        } finally {
            // Always release the lock.
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}