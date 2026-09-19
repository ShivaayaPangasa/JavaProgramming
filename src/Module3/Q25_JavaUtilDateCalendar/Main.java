package Module3.Q25_JavaUtilDateCalendar;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Date object representing the current instant.
        Date currentDate = new Date();

        // Calendar object using current date, time and locale.
        Calendar currentCalendar =
                Calendar.getInstance();

        System.out.println(
                "Using Date: " + currentDate
        );

        // getTime() converts Calendar information into Date form.
        System.out.println(
                "Using Calendar: "
                        + currentCalendar.getTime()
        );
    }
}