package Module3.Q20_ListDirectory;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a directory path: ");
        String path = scanner.nextLine();

        File directory = new File(path);

        try {
            if (!directory.exists()) {
                System.out.println("The path does not exist.");
                return;
            }

            if (!directory.isDirectory()) {
                System.out.println("The path is not a directory.");
                return;
            }

            File[] files = directory.listFiles();

            // listFiles() may return null if reading fails.
            if (files == null) {
                System.out.println("The directory cannot be read.");
                return;
            }

            for (File file : files) {
                String type = file.isDirectory() ? "Directory" : "File";

                System.out.println(type + ": " + file.getName());
            }
        } catch (SecurityException e) {
            System.out.println("Permission denied: " + e.getMessage());
        }
    }
}