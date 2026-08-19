package Module2.Q07_try_catch_finally;

public class DivisionDemo {

    public void demonstrateTryCatch(
            int numerator, int denominator) {

        System.out.println("Using try-catch:");

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println(
                    "Error: Cannot divide by zero.");
        }
    }

    public void demonstrateTryCatchFinally(
            int numerator, int denominator) {

        System.out.println("\nUsing try-catch-finally:");

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println(
                    "Error: Cannot divide by zero.");
        } finally {
            System.out.println(
                    "Finally block always executes.");
        }
    }
}