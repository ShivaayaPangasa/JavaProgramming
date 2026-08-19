package Module2.Q06_MethodReference_Square;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction =
                SquareCalculator::findSquare;

        int number = 6;
        int result = squareFunction.apply(number);

        System.out.println("Square of " + number + " is " + result);
    }
}