package Module3.Q04_CountdownTimer;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Thread countdown = new Thread ( () -> {
            for(int number = 10; number >= 1; number--){
                System.out.println("Countdown" + number);
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread ticker = new Thread( () ->  {
            for (int count = 1; count <= 20 ;count++){
                System.out.println("Tick...");

                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        countdown.start();
        ticker.start();

        countdown.join();
        ticker.join();
    }
}

/* OUTPUT
Tick...
Countdown10
Tick...
Tick...
Countdown9
Tick...
Countdown8
Tick...
Tick...
Countdown7
Tick...
Tick...
Countdown6
Tick...
Tick...
Countdown5
Tick...
Tick...
Countdown4
Tick...
Tick...
Countdown3
Tick...
Tick...
Countdown2
Tick...
Tick...
Countdown1
Tick...
Tick... */