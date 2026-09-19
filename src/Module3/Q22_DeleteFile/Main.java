package Module3.Q22_DeleteFile;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/Module3/Q22_DeleteFile/delete-me.txt");

        try {
            // Create the file first so we have something to delete
            if (file.createNewFile()) {
                System.out.println("Temporary file created for testing deletion.");
            }

            if (file.delete()) {
                System.out.println("The file was deleted successfully.");
            } else {
                System.out.println("The file could not be deleted.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}