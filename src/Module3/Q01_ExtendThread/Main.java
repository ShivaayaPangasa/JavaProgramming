package Module3.Q01_ExtendThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        EvenNumberThread thread = new EvenNumberThread();

        thread.start();

        thread.join();
    }
}

class EvenNumberThread extends Thread {
    @Override
    public void run() {
        
        for (int number = 2; number <= 20; number += 2) {
            System.out.println(number);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}