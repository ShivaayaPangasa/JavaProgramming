package Module3.Q06_DeamonThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Thread autoSave = new Thread(() -> {
            // The daemon keeps working while user threads exist.
            while (true) {
                System.out.println("Auto-Save in progress...");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });
        
        autoSave.setDaemon(true);
        autoSave.start();

        //Main thread performs file processing task
        for(int part = 1; part<=5 ; part++){
            System.out.println("Processing file part" + part);
            Thread.sleep(1000);
        }
        System.out.println("File processing complete");
    }
}