package Extra.Q04_CreateTwoThreads;

class NumberThread extends Thread {

    int start;
    int end;

    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        NumberThread t1 = new NumberThread(1, 10);
        NumberThread t2 = new NumberThread(11, 20);

        t1.start();

        t1.join();

        t2.start();
    }
}