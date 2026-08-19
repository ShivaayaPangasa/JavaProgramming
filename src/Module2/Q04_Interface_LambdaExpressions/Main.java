package Module2.Q04_Interface_LambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        int number1 = 10;
        int number2 = 5;

        System.out.println("Addition: " + addition.compute(number1, number2));

        System.out.println("Subtraction: " + subtraction.compute(number1, number2));

        System.out.println("Multiplication: " + multiplication.compute(number1, number2));
    }
}