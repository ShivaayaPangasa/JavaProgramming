package Extra.Q24_ThreadPriorityJoin;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread( () -> {
            for(int i = 0; i <=5 ; i++){
                System.out.println("Thread 1: " + i);
            }
        }
        );

        Thread t2 = new Thread( () -> {
            for(int i = 0; i <= 5; i++){
                System.out.println("Thread 2: " + i);
            }
        }
        );

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads finished");

    }    
}