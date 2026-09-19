package Module3.Q13B_TryLockFix;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        Thread thread1 = new Thread( () -> tryBothLocks(lock1, lock2), "Thread-1" );

        Thread thread2 = new Thread( () -> tryBothLocks(lock2, lock1), "Thread-2" );

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Program ended without deadlock.");
    }

    private static void tryBothLocks(
            ReentrantLock first,
            ReentrantLock second
    ) {
        boolean firstAcquired = false;
        boolean secondAcquired = false;

        try {
            // Wait at most one second for the first lock.
            firstAcquired = first.tryLock(1, TimeUnit.SECONDS);

            if (!firstAcquired) {
                System.out.println(Thread.currentThread().getName() + " could not get first lock.");
                return;
            }

            System.out.println(Thread.currentThread().getName() + " got first lock.");

            Thread.sleep(100);

            // Wait at most one second for the second lock.
            secondAcquired = second.tryLock(1, TimeUnit.SECONDS);

            if (secondAcquired) {
                System.out.println(Thread.currentThread().getName() + " got both locks.");
            } else {
                System.out.println(Thread.currentThread().getName() + " timed out and will release " + "its first lock.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            // Unlock only locks this thread successfully acquired.
            if (secondAcquired) {
                second.unlock();
            }

            if (firstAcquired) {
                first.unlock();
            }
        }
    }
}