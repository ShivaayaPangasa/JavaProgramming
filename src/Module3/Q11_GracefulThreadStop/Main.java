package Module3.Q11_GracefulThreadStop;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        DownloadTask task = new DownloadTask();
        Thread downloadThread = new Thread(task);

        downloadThread.start();

        // Main lets the download work for 2.2 seconds.
        Thread.sleep(2200);

        // Request cooperative cancellation.
        task.stopDownload();

        // Wait until the thread sees the flag and finishes.
        downloadThread.join();
    }
}

class DownloadTask implements Runnable {
    // volatile makes changes visible across threads.
    private volatile boolean downloading = true;

    public void stopDownload() {
        downloading = false;
    }

    @Override
    public void run() {
        int chunk = 1;

        while (downloading) {
            System.out.println("Downloading chunk " + chunk);
            chunk++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Download stopped safely.");
    }
}