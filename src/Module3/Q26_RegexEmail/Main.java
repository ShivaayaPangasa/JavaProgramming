package Module3.Q26_RegexEmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        String regex =
                "^[A-Za-z0-9+_.-]+"
                        + "@"
                        + "[A-Za-z0-9.-]+"
                        + "\\."
                        + "[A-Za-z]{2,}$";

        // Compile the regex once into a Pattern.
        Pattern pattern = Pattern.compile(regex);

        // Connect the compiled pattern to the input.
        Matcher matcher = pattern.matcher(email);

        // matches() checks the complete string.
        if (matcher.matches()) {
            System.out.println(
                    "Valid email address."
            );
        } else {
            System.out.println(
                    "Invalid email address."
            );
        }
    }
}