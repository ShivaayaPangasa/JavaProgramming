package Module3.Q16_ReadCharacterStream;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
                FileReader reader =
                        new FileReader("src/Module3/Q16_ReadCharacterStream/input.txt")
        ) {
            int character;

            // read() now provides decoded characters.
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}