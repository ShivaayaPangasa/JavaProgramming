package Module3.Q23_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try (
                // "rw" means both read and write access.
                RandomAccessFile file =
                        new RandomAccessFile(
                                "src/Module3/Q23_RandomAccessFile/random.txt", "rw"
                        )
        ) {
            // Clear content left from an earlier run.
            file.setLength(0);

            // Pointer begins at byte position zero.
            file.writeBytes("Hello Java World");

            // Move the pointer to the J in Java.
            file.seek(6);

            // Overwrite Java with File.
            file.writeBytes("File");

            // Return to the beginning.
            file.seek(0);

            System.out.println(file.readLine());
        } catch (IOException e) {
            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}