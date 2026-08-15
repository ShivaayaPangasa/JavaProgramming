package Module1.Q45_RuntimePolymorphism;

public class UPIPayment extends Payment {

    @Override
    public void pay(){
        System.out.println("Payment completed using UPI");
    }

}