package Module3.Q19_FileExistence;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File represents a file-system path.
        File file = new File("src/Module3/Q19_FileExistencce/sample.txt");

        if (file.exists()) {
            System.out.println("The file already exists.");
        } else {
            try {
                // createNewFile() returns true only if created now.
                if (file.createNewFile()) {
                    System.out.println("The file was created.");
                } else {
                    System.out.println("The file could not be created.");
                }
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            }
        }
    }
}