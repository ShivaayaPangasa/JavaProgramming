package Extra.Q22_CharacterFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String fileName = "src/Extra/Q22_CharacterFileHandling/message.txt";

        try{
            try(FileWriter writer = new FileWriter(fileName)){
                writer.write("Learning Java File Handling");
                writer.write("\nThis is the second line");
            }

            try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }
        } catch(IOException e){
            System.out.println("File Error: " + e.getMessage());
        }
    }
}