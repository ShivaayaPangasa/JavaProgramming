package Module3.Q08_SynchronisedBlockInventory;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Inventory inventory = new Inventory();
        Thread worker1 = new Thread(() -> inventory.removeStock("Worker1", 2));
        Thread worker2 = new Thread(() -> inventory.removeStock("Worker2", 4));

        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();
    
    }

}

class Inventory{
    private int stock = 5;
    //final ensures the lock reference never changes
    private final Object lock = new Object();
    public void removeStock(String worker, int quantity){
        synchronized(lock){
            if(stock>=quantity){
                stock -= quantity;
                System.out.println(worker + " removed " + quantity + " items. Remaining " + stock);
            }
            else {
                System.out.println(worker + " failed. Only " + stock + " items left.");
            }
        }
    }
}