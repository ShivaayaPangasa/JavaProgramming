package Module5.PracticeExercise.Q05_MultiModuleMaven.module-b;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String message = "Maven Multi-Module Project";

        System.out.println("Module B");
        System.out.println("Message: " + message);
        System.out.println("Is message empty? " + StringUtils.isEmpty(message));
        System.out.println("Uppercase: " + StringUtils.upperCase(message));
    }
}
