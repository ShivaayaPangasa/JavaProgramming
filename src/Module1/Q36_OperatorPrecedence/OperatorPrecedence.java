package Module1.Q36_OperatorPrecedence;

public class OperatorPrecedence {
    public static void main(String[] args) {

        PrecedenceCalculator calculator = new PrecedenceCalculator();

        calculator.calculate();
    }
}

/* Precedence: 

()
* / %
+ -
comparisons
logical operators 

Associativity Rules When Precedence Ties -
When two operators in an expression have the same precedence level, associativity determines the execution order.
Left-to-Right: Most operators evaluate from left to right (e.g., a + b - c evaluates a + b first).
Right-to-Left: Assignment, ternary and unary operators evaluate from right to left (e.g., a = b = c assigns c to b first, then b to a).

*/