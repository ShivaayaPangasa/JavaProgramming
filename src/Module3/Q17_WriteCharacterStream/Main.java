package Module3.Q17_WriteCharacterStream;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Learning Java character streams.";

        try (
            FileWriter writer = new FileWriter("src/Module3/Q17_WriteCharacterStream/example.txt")
        ) {
            // Writer accepts a String directly.
            writer.write(text);

            System.out.println("Text written to example.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}