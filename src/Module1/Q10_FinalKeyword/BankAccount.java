package Module1.Q10_FinalKeyword;

public class BankAccount {

    final int minimumBalance = 1000; //means value cannot change

    public final void showRules() { //means child classes cannot override the method.
        System.out.println("Minimum Balance = " + minimumBalance);
    }
}