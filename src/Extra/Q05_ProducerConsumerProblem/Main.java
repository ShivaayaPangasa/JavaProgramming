package Extra.Q05_ProducerConsumerProblem;

class Buffer {

    private int value;
    private boolean available = false;

    synchronized void produce(int value) throws InterruptedException {

        while (available) {
            wait();
        }

        this.value = value;
        available = true;

        System.out.println("Produced: " + value);

        notify();
    }

    synchronized void consume() throws InterruptedException {

        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + value);
        available = false;

        notify();
    }
}

class Producer extends Thread {

    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {
                buffer.produce(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {

    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {
                buffer.consume();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}