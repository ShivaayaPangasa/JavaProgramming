package Module3.Q09_DiningPhilosophersDeadlock;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Object chopstick1 = new Object();
        Object chopstick2 = new Object();

        // This gate guarantees that both philosophers hold one chopstick
        // before either tries to obtain the second.
        CountDownLatch bothHoldingOne = new CountDownLatch(2);

        Thread philosopher1 = new Thread(() -> {
            try {
                synchronized (chopstick1) {
                    System.out.println(
                            "Philosopher 1 picked up chopstick 1."
                    );

                    bothHoldingOne.countDown();
                    bothHoldingOne.await();

                    System.out.println(
                            "Philosopher 1 is waiting for chopstick 2."
                    );

                    synchronized (chopstick2) {
                        System.out.println(
                                "Philosopher 1 is eating."
                        );
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread philosopher2 = new Thread(() -> {
            try {
                synchronized (chopstick2) {
                    System.out.println(
                            "Philosopher 2 picked up chopstick 2."
                    );

                    bothHoldingOne.countDown();
                    bothHoldingOne.await();

                    System.out.println(
                            "Philosopher 2 is waiting for chopstick 1."
                    );

                    synchronized (chopstick1) {
                        System.out.println(
                                "Philosopher 2 is eating."
                        );
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // These only stop the classroom demo from freezing the JVM.
        // They do not solve the deadlock.
        philosopher1.setDaemon(true);
        philosopher2.setDaemon(true);

        philosopher1.start();
        philosopher2.start();

        Thread.sleep(500);

        System.out.println(
                "Philosopher 1 state: " + philosopher1.getState()
        );
        System.out.println(
                "Philosopher 2 state: " + philosopher2.getState()
        );
        System.out.println(
                "Deadlock created: each philosopher holds one chopstick."
        );
    }
}