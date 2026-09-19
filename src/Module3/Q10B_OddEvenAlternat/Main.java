package Module3.Q10B_OddEvenAlternat;


public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread evenThread = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();
    }
}

class NumberPrinter {
    private int number = 1;
    private final int limit = 20;

    public synchronized void printOdd()
            throws InterruptedException {

        while (number <= limit) {
            // Odd thread waits when the current number is even.
            while (number <= limit && number % 2 == 0) {
                wait();
            }

            if (number <= limit) {
                System.out.println("Odd thread: " + number);
                number++;

                // Wake the even thread.
                notify();
            }
        }
    }

    public synchronized void printEven()
            throws InterruptedException {

        while (number <= limit) {
            // Even thread waits when the current number is odd.
            while (number <= limit && number % 2 != 0) {
                wait();
            }

            if (number <= limit) {
                System.out.println("Even thread: " + number);
                number++;

                // Wake the odd thread.
                notify();
            }
        }
    }
}