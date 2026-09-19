package Module3.Q15_WriteByteStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String text = "Java I/O Streams Example";

        try (
            FileOutputStream output = new FileOutputStream("src/Module3/Q15_WriteByteStream/output.txt");
        ) {
            // Convert String characters into UTF-8 bytes.
            byte[] bytes =
                    text.getBytes(StandardCharsets.UTF_8);

            output.write(bytes);

            System.out.println(
                    "Text written to output.txt"
            );
        } catch (IOException e) {
            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}