package Extra.Q11_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main{

    public static void main(String[] args){
        try {
            FileInputStream file = new FileInputStream("src/Extra/Q11_FileInputStream/input.txt");
            int data;
            while ((data = file.read()) != -1){
                System.out.println((char)data);
            }
            file.close();
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
 }