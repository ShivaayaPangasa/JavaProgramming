package Module3.Q05_ThreadNamingPriority;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Runnable task = () -> {
            for(int count =1; count<=3; count++){
                Thread current = Thread.currentThread();
                System.out.println(current.getName() + " | priority = " + current.getPriority() + " | step = " + count);
            }
        };

        Thread worker1 = new Thread(task, "Worker 1");
        Thread worker2 = new Thread(task, "Worker 2");
        Thread worker3 = new Thread(task, "Worker 3");

        worker1.setPriority(Thread.MIN_PRIORITY);
        worker2.setPriority(Thread.NORM_PRIORITY);
        worker3.setPriority(Thread.MAX_PRIORITY);

        worker1.start();
        worker2.start();
        worker3.start();
        
        worker1.join();
        worker2.join();
        worker3.join();

    }
}
// Any order is valid. The program is demonstrating names, priorities and the actual observed execution order.