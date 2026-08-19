package Module2.Q10_throw_throws_factorial;

public class FactorialCalculator {

    public long calculateFactorial(int number)
            throws IllegalArgumentException {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Factorial is not defined "
                            + "for negative numbers.");
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}