package Module1.Q36_OperatorPrecedence;

public class PrecedenceCalculator {

    public void calculate() {

        int result1 = 10 + 5 * 2;

        int result2 = (10 + 5) * 2;

        System.out.println("Without brackets = " + result1);

        System.out.println("With brackets = " + result2);
    }
}