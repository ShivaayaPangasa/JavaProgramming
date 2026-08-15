package Module1.Q45_RuntimePolymorphism;

public class RuntimePolymorphism{
    public static void main(String[] args){

        Payment payment; //creating reference variable 

        payment = new UPIPayment(); //reference variable points to UPI object

        payment.pay(); //runs UPIPayment.pay()

        payment = new CardPayment();  //reference variable points to CardPayment object

        payment.pay(); //runs CardPayment.pay()

    }

}

// Java decides the method at rutime according to actual object
// Runtime Polymorphism = Dynmaic Method Dispach 