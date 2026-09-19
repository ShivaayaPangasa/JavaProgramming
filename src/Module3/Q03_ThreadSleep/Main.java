package Module3.Q03_ThreadSleep;

public class Main{
    public static void main(String[] args) throws InterruptedException{

        Thread thread1 = new Thread(new MessageTask("Thread1", 1000));

        Thread thread2 = new Thread(new MessageTask("Thread2", 2000));

        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
    }
}

class MessageTask implements Runnable{
    private final String message;
    private final long delay;

    MessageTask(String message, long delay){
        this.message = message;
        this.delay = delay;
    }

    @Override
    public void run(){
        for(int count=1; count<=5; count++){
            System.out.println(message);

            try{
                Thread.sleep(delay);
            }

            catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
/* Thread scheduling is nondeterministic hence the order of the output may vary.
Thread2
Thread1
Thread1
Thread1
Thread2
Thread1
Thread2
Thread1
Thread2
Thread2
*/