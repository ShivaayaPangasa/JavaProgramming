package Module3.Q18_BufferedIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/Module3/Q18_BufferedIO/buffer.txt";

        // First write the file.
        try (
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName)
                        )
        ) {
            writer.write("First line");

            // Writes the correct line separator for the system.
            writer.newLine();

            writer.write("Second line");
        } catch (IOException e) {
            System.out.println(
                    "Writing error: " + e.getMessage()
            );

            // Do not try to read when writing failed.
            return;
        }

        // Now read the same file.
        try (
                BufferedReader reader =
                        new BufferedReader(
                                new FileReader(fileName)
                        )
        ) {
            String line;

            // readLine() returns null at the end of the file.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(
                    "Reading error: " + e.getMessage()
            );
        }
    }
}