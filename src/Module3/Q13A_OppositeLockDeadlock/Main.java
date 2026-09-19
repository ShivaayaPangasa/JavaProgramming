package Module3.Q13A_OppositeLockDeadlock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        CountDownLatch bothHoldingOne =
                new CountDownLatch(2);

        // Thread 1 requests lock1 and then lock2.
        Thread thread1 = new Thread(
                () -> lockInOrder(
                        lock1,
                        lock2,
                        bothHoldingOne
                )
        );

        // Thread 2 requests lock2 and then lock1.
        Thread thread2 = new Thread(
                () -> lockInOrder(
                        lock2,
                        lock1,
                        bothHoldingOne
                )
        );

        // Prevent the deliberate deadlock from freezing the JVM.
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        Thread.sleep(500);

        System.out.println(
                "Thread 1 state: " + thread1.getState()
        );
        System.out.println(
                "Thread 2 state: " + thread2.getState()
        );
        System.out.println(
                "Deadlock created by opposite lock order."
        );
    }

    private static void lockInOrder(
            ReentrantLock first,
            ReentrantLock second,
            CountDownLatch bothHoldingOne
    ) {
        first.lock();

        try {
            System.out.println(
                    Thread.currentThread().getName()
                            + " acquired its first lock."
            );

            bothHoldingOne.countDown();
            bothHoldingOne.await();

            // Both threads become stuck here waiting for each other.
            second.lock();

            try {
                System.out.println("Both locks acquired.");
            } finally {
                second.unlock();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            first.unlock();
        }
    }
}