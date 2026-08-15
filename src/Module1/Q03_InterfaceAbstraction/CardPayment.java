package Module1.Q03_InterfaceAbstraction;

public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs" + amount + " using card");
    }

}