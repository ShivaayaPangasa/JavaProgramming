package Module3.Q10A_ProducerConsumer;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        DataBuffer buffer = new DataBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int value = 1; value <= 5; value++) {
                    buffer.produce(value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int count = 1; count <= 5; count++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

class DataBuffer {
    private int data;

    // false means the single storage position is empty.
    private boolean available = false;

    public synchronized void produce(int value)
            throws InterruptedException {

        // Producer waits while old data has not been consumed.
        while (available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("Produced: " + value);

        // Wake the waiting consumer.
        notify();
    }

    public synchronized int consume()
            throws InterruptedException {

        // Consumer waits while there is no data.
        while (!available) {
            wait();
        }

        int value = data;
        available = false;

        System.out.println("Consumed: " + value);

        // Wake the waiting producer.
        notify();

        return value;
    }
}