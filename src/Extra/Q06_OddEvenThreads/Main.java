package Extra.Q06_OddEvenThreads;

class NumberPrinter {

    private boolean oddTurn = true;

    synchronized void printOdd(int number) throws InterruptedException {

        while (!oddTurn) {
            wait();
        }

        System.out.print(number + " ");

        oddTurn = false;

        notify();
    }

    synchronized void printEven(int number) throws InterruptedException {

        while (oddTurn) {
            wait();
        }

        System.out.print(number + " ");

        oddTurn = true;

        notify();
    }
}

class OddThread extends Thread {

    NumberPrinter printer;

    OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {

        for (int i = 1; i <= 99; i += 2) {

            try {
                printer.printOdd(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class EvenThread extends Thread {

    NumberPrinter printer;

    EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {

        for (int i = 2; i <= 100; i += 2) {

            try {
                printer.printEven(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        OddThread odd = new OddThread(printer);
        EvenThread even = new EvenThread(printer);

        odd.start();
        even.start();
    }
}