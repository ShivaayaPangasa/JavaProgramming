package PracticalFile.Q06_ParallelVowelCounting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("large-text.txt");

        createSampleFileIfMissing(file);

        // Read the file using BufferedReader.
        StringBuilder allText = new StringBuilder();

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;

            while ((line = reader.readLine()) != null) {
                allText.append(line).append('\n');
            }
        }

        String content = allText.toString();

        System.out.println("Characters read: " + content.length());

        // Part 1: Single-threaded calculation.
        long singleStart = System.nanoTime();

        int singleCount = countVowels(content);

        long singleNanos = System.nanoTime() - singleStart;

        // Part 2: Split the text into 4 approximately equal chunks.
        int chunkSize = (content.length() + 3) / 4;

        ExecutorService pool = Executors.newFixedThreadPool(4);
        List<Future<Integer>> futures = new ArrayList<>();

        long parallelStart = System.nanoTime();

        for (int i = 0; i < 4; i++) {
            int start = Math.min(
                i * chunkSize, content.length()
            );

            int end = Math.min(
                start + chunkSize, content.length()
            );

            String chunk = content.substring(start, end);

            Future<Integer> future = pool.submit(
                () -> countVowels(chunk)
            );

            futures.add(future);
        }

        // get() waits for each task's answer.
        int parallelCount = 0;

        for (Future<Integer> future : futures) {
            parallelCount += future.get();
        }

        long parallelNanos = System.nanoTime() - parallelStart;

        pool.shutdown();

        System.out.println("Single-thread vowel count: " + singleCount);
        System.out.println("Parallel vowel count:      " + parallelCount);

        System.out.println(
            "Counts match: " + (singleCount == parallelCount)
        );

        System.out.printf(
            "Single-thread time: %.3f ms%n",
            singleNanos / 1_000_000.0
        );

        System.out.printf(
            "4-thread time:      %.3f ms%n",
            parallelNanos / 1_000_000.0
        );

        System.out.println("Input file: " + file.toAbsolutePath());
    }

    private static int countVowels(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // Make a sample file on the first run, so no manual setup is needed.
    private static void createSampleFileIfMissing(Path file)
            throws Exception {

        if (Files.exists(file)) {
            return; // Do not overwrite an existing file.
        }

        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (int i = 1; i <= 20000; i++) {
                writer.write(
                    "The quick brown fox jumps over the lazy dog. "
                    + "This is sample line " + i + "."
                );

                writer.newLine();
            }
        }
    }
}