package Extra.Q07_ReadCopy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("src/Extra/Q07_ReadCopy/test.txt");
            FileWriter writer = new FileWriter("src/Extra/Q07_ReadCopy/copy.txt");

            int data;

            while ((data = reader.read()) != -1) {

                writer.write(data);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}