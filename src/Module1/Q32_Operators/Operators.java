package Module1.Q32_Operators;

public class Operators {

    static void arithmeticOperators() {

        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        System.out.println();
    }

    static void relationalOperators() {

        int a = 10;
        int b = 5;

        System.out.println("Relational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println();
    }

    static void logicalOperators() {

        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));
        System.out.println("!y     : " + (!y));
    }

    public static void main(String[] args) {

        arithmeticOperators();
        relationalOperators();
        logicalOperators();

    }
}