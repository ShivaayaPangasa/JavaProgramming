package Module3.Q14_ReadByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try-with-resources closes the stream automatically.
        try (
                FileInputStream input = new FileInputStream("src/Module3/Q14_ReadByteStream/input.txt")
        ) {
            int data;

            // read() returns one byte or -1 at end of file.
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}