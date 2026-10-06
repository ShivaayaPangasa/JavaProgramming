package Extra.Q08_SumEvenOddThreads;

class EvenThread extends Thread {

    public void run(){

        int sum = 0;
        int i;

        for(i = 2; i<=100; i+=2){
            sum = sum + i;
        }
        System.out.println("Sum of even numbers: "+ sum);

    }

}

class OddThread extends Thread {

    public void run(){

        int sum = 0;
        int i;

        for(i=1; i<=100; i+=2){
            sum = sum + i;
        }
        System.out.println("Sum of odd number: " + sum);

    }
}

public class Main {
    public static void main(String[] args){
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        evenThread.start();
        oddThread.start();
    }
}