package PracticalFile.Q05_ThreadSafeLoggerSingleton;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getInstance();

        Thread[] workers = new Thread[5];
        AtomicReference<Exception> threadError = new AtomicReference<>();

        for (int i = 0; i < workers.length; i++) {
            final int workerNumber = i + 1;

            workers[i] = new Thread(() -> {
                for (int messageNumber = 1;
                     messageNumber <= 100;
                     messageNumber++) {

                    try {
                        logger.log(
                            "worker=" + workerNumber
                            + " message=" + messageNumber
                        );
                    } catch (Exception ex) {
                        threadError.compareAndSet(null, ex);
                    }
                }
            }, "Worker-" + workerNumber);

            workers[i].start();
        }

        // Wait until all 5 threads finish.
        for (Thread worker : workers) {
            worker.join();
        }

        logger.close();

        if (threadError.get() != null) {
            throw new RuntimeException(
                "A worker could not write to the log",
                threadError.get()
            );
        }

        // Read the file and check the results.
        List<String> lines = Files.readAllLines(
            Path.of("concurrent.log"),
            StandardCharsets.UTF_8
        );

        Set<String> uniqueLines = new HashSet<>(lines);

        boolean noCorruptedLines = lines.stream().allMatch(
            line -> line.matches("worker=\\d+ message=\\d+")
        );

        System.out.println("Expected messages: 500");
        System.out.println("Lines read: " + lines.size());
        System.out.println("Unique lines: " + uniqueLines.size());

        System.out.println(
            "Every line has the expected format: " + noCorruptedLines
        );

        System.out.println(
            "Verification passed: "
            + (lines.size() == 500
               && uniqueLines.size() == 500
               && noCorruptedLines)
        );

        System.out.println("Log file: concurrent.log");
    }
}

// Thread-safe singleton.
class Logger {
    private static volatile Logger instance;

    private final BufferedWriter writer;
    private final Object writeLock = new Object();

    private Logger() throws IOException {
        writer = Files.newBufferedWriter(
            Path.of("concurrent.log"),
            StandardCharsets.UTF_8,
            StandardOpenOption.CREATE,
            StandardOpenOption.TRUNCATE_EXISTING,
            StandardOpenOption.WRITE
        );
    }

    public static Logger getInstance() throws IOException {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }

        return instance;
    }

    public void log(String message) throws IOException {
        synchronized (writeLock) {
            writer.write(message);
            writer.newLine();
            writer.flush();
        }
    }

    public void close() throws IOException {
        synchronized (writeLock) {
            writer.close();
        }
    }
}