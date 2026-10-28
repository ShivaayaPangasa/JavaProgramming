package PracticalFile.Q04_InterfaceConflictsAndExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(100.00);

        // Explicitly resolves the two default process() methods.
        account.process();

        try {
            account.transfer(30.00);
            System.out.printf(
                "Transfer successful. Balance: Rs. %.2f%n",
                account.getBalance()
            );
        } catch (AccountFrozenException | NegativeBalanceException ex) {
            System.out.println("Transfer failed: " + ex.getMessage());
        }

        try {
            account.transfer(1000.00);
        } catch (AccountFrozenException | NegativeBalanceException ex) {
            System.out.println("Transfer failed: " + ex.getMessage());
        }

        account.setFrozen(true);

        try {
            account.transfer(10.00);
        } catch (AccountFrozenException | NegativeBalanceException ex) {
            System.out.println("Transfer failed: " + ex.getMessage());
        }

        System.out.println(
            "Every attempt is appended to transaction.log"
        );
    }
}

interface Debitable {
    default void process() {
        System.out.println("Debitable default process() called");
    }
}

interface Creditable {
    default void process() {
        System.out.println("Creditable default process() called");
    }
}

class SavingsAccount implements Debitable, Creditable {
    private double balance;
    private boolean frozen;

    public SavingsAccount(double openingBalance) {
        balance = openingBalance;
    }

    @Override
    public void process() {
        System.out.println("Resolving the default-method conflict:");

        // Explicitly call the default method from each interface.
        Debitable.super.process();
        Creditable.super.process();
    }

    public double getBalance() {
        return balance;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public void transfer(double amount) throws AccountFrozenException {
        String outcome = "FAILED";

        try {
            if (frozen) {
                throw new AccountFrozenException("Account is frozen");
            }

            if (amount <= 0 || amount > balance) {
                throw new NegativeBalanceException(
                    "Invalid amount or insufficient balance"
                );
            }

            balance -= amount;
            outcome = "SUCCESS";

        } finally {
            // Executes for success as well as exceptions.
            appendLog(
                "amount=" + amount
                + ", outcome=" + outcome
                + ", balance=" + balance
            );
        }
    }

    private void appendLog(String details) {
        try (FileWriter writer = new FileWriter("transaction.log", true)) {
            writer.write(
                LocalDateTime.now() + " | " + details
                + System.lineSeparator()
            );
        } catch (IOException ex) {
            System.out.println(
                "Could not write transaction log: " + ex.getMessage()
            );
        }
    }
}

// Unchecked exception.
class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

// Checked exception.
class AccountFrozenException extends Exception {
    public AccountFrozenException(String message) {
        super(message);
    }
}