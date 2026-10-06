package Extra.Q09_BankAccountWithdrawDeposit;

class BankAccount {

    private int balance = 1000;

    synchronized void deposit(int amount){
        balance  = balance + amount;
        System.out.println("Deposited: " + amount + " and Balance: " + balance);
    }
    
    synchronized void withdraw(int amount){

        if (balance >= amount){
            balance = balance - amount;
            System.out.println("Balance left: " + balance + " after withdrawing " + amount);
        }
        else{
            System.out.println("Cannot withdraw due to insufficient funds");
        }
    }
}

class DepositThread extends Thread {

    private BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run(){
        account.deposit(500);
    }
}

class WithdrawThread extends Thread {

    private BankAccount account;

    WithdrawThread(BankAccount account){
        this.account = account;
    }
    public void run(){
        account.withdraw(600);
    }
}

public class Main{
    public static void main(String[] args){

        BankAccount account = new BankAccount();

        DepositThread t1 = new DepositThread(account);
        DepositThread t2 = new DepositThread(account);

        WithdrawThread t3 = new WithdrawThread(account);
        WithdrawThread t4 = new WithdrawThread(account);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}