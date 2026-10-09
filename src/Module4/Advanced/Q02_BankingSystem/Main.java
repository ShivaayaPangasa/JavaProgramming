package Module4.Advanced.Q02_BankingSystem;

// Banking system with Map balances
 
import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<Integer, Double> balances = new HashMap<>();
    void addCustomer(int id, double openingBalance) { balances.put(id, openingBalance); }
    void deposit(int id, double amount) {
        if (amount <= 0 || !balances.containsKey(id)) throw new IllegalArgumentException("Invalid deposit/customer");
        balances.put(id, balances.get(id) + amount);
    }
    boolean withdraw(int id, double amount) {
        if (!balances.containsKey(id) || amount <= 0 || balances.get(id) < amount) return false;
        balances.put(id, balances.get(id) - amount);
        return true;
    }
    Double balance(int id) { return balances.get(id); }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer(101, 1000.0); bank.deposit(101, 250.0);
        System.out.println("Withdraw 300: " + bank.withdraw(101, 300.0));
        System.out.println("Balance: " + bank.balance(101));
        System.out.println("Withdraw 5000: " + bank.withdraw(101, 5000.0));
    }
}
