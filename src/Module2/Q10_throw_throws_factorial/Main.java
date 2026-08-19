package Module2.Q10_throw_throws_factorial;

public class Main {

    public static void main(String[] args) {
        FactorialCalculator calculator =
                new FactorialCalculator();

        try {
            int number = -5;

            long result =
                    calculator.calculateFactorial(number);

            System.out.println(
                    "Factorial of " + number
                            + " is " + result);

        } catch (IllegalArgumentException exception) {
            System.out.println(
                    "Exception caught: "
                            + exception.getMessage());
        }
    }
}