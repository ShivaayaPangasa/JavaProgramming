package Module3.Q24_JavaLangMath;

public class Main {
    public static void main(String[] args) {
        // Random double from 0.0 inclusive to 1.0 exclusive.
        double randomNumber = Math.random();

        // Converts -25 into positive 25.
        int absoluteValue = Math.abs(-25);

        // 2 raised to the power 3.
        double power = Math.pow(2, 3);

        System.out.println(
                "Random number: " + randomNumber
        );
        System.out.println(
                "Absolute value: " + absoluteValue
        );
        System.out.println(
                "2 raised to 3: " + power
        );
    }
}