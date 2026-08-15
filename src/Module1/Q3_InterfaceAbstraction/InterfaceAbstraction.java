
package Module1.Q3_InterfaceAbstraction;

public class InterfaceAbstraction {
    public static void main(String[] args) {

        PaymentMethod payment = new CardPayment();

        payment.pay(1500);
    }
}