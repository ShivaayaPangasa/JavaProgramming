package Module3.Q21_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
                FileInputStream input =
                        new FileInputStream("src/Module3/Q21_CopyFile/source.txt");
                
                FileOutputStream output = new FileOutputStream("src/Module3/Q21_CopyFile/copy.txt");

        ) {
            // Temporary memory area holding 1,024 bytes.
            byte[] buffer = new byte[1024];

            int bytesRead;

            // Read blocks until end of file.
            while (
                    (bytesRead = input.read(buffer)) != -1
            ) {
                // Write only the bytes actually read.
                output.write(buffer, 0, bytesRead);
            }

            System.out.println(
                    "File copied successfully."
            );
        } catch (IOException e) {
            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}