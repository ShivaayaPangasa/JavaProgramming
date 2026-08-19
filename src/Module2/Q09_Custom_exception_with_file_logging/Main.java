package Module2.Q09_Custom_exception_with_file_logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private static final Logger LOGGER =
            Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        configureLogger();

        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(16);
        } catch (InvalidAgeException exception) {
            System.out.println(
                    "Exception caught: "
                            + exception.getMessage());

            LOGGER.severe(exception.getMessage());
        }
    }

    private static void configureLogger() {
        try {
            FileHandler fileHandler =
                    new FileHandler("age_error.log", true);

            fileHandler.setFormatter(
                    new SimpleFormatter());

            LOGGER.addHandler(fileHandler);
            LOGGER.setUseParentHandlers(false);

        } catch (IOException exception) {
            System.out.println(
                    "Unable to create log file: "
                            + exception.getMessage());
        }
    }
}