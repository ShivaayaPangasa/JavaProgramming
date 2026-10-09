package Module4.Concurrency.Q06_CopyOnWriteArrayList;

// Safely iterate while another thread modifies list

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
        names.add("Asha"); names.add("Shivaaya"); names.add("Ajay");
        Thread reader = new Thread(new Runnable() {
            public void run() {
                for (String name : names) {
                    System.out.println("Reading snapshot: " + name);
                    try { Thread.sleep(20); } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); return;
                    }
                }
            }
        });
        reader.start();
        names.add("New person"); // Iteration uses a snapshot; no ConcurrentModificationException.
        reader.join();
        System.out.println("Current list=" + names);
    }
}