package PracticalFile.Q03_LambdasGenericsAndCheckedException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DataFormatException {
        List<String> values = List.of("12", "25", "oops");

        // Transformation 1: String -> String
        System.out.println(
            "Uppercase: " + applyAll(values, text -> text.toUpperCase())
        );

        // Transformation 2: String -> Integer
        System.out.println(
            "Lengths: " + applyAll(values, text -> text.length())
        );

        // Transformation 3: String -> Integer
        // Invalid text produces our checked DataFormatException.
        try {
            List<Integer> numbers = applyAll(values, text -> {
                try {
                    return Integer.parseInt(text);
                } catch (NumberFormatException ex) {
                    throw new DataFormatException(
                        "Not a valid integer: " + text, ex
                    );
                }
            });

            System.out.println("Numbers: " + numbers);

        } catch (DataFormatException ex) {
            System.out.println(
                "Transformation failed: " + ex.getMessage()
            );

            logException(ex);

            System.out.println(
                "Details were written to data-format-errors.log"
            );
        }
    }

    // Generic method: T is the input type, R is the result type.
    public static <T, R> List<R> applyAll(
        List<T> input,
        Transformer<T, R> fn
    ) throws DataFormatException {

        List<R> results = new ArrayList<>();

        for (T item : input) {
            results.add(fn.transform(item));
        }

        return results;
    }

    private static void logException(Exception ex) {
        String line = LocalDateTime.now()
                + " | " + ex + System.lineSeparator();

        try {
            Files.writeString(
                Path.of("data-format-errors.log"),
                line,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
        } catch (IOException ioEx) {
            System.out.println(
                "Could not write log file: " + ioEx.getMessage()
            );
        }
    }
}

@FunctionalInterface
interface Transformer<T, R> {
    R transform(T input) throws DataFormatException;
}

// A checked exception must be caught or declared by the caller.
class DataFormatException extends Exception {
    public DataFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}