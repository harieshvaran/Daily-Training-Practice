class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }
        if (amount > getBalance()) {
            throw new InsufficientFundsException("Insufficient balance in Savings Account.");
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrawn from Savings: " + amount);
    }
}

class CurrentAccount extends BankAccount {
    private double minimumBalance = 1000.0;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }
        if (getBalance() - amount < minimumBalance) {
            throw new InsufficientFundsException("Withdrawal violates minimum balance requirement of " + minimumBalance);
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrawn from Current: " + amount);
    }
}

public class BankExcEncap {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("SA101", "Rahul", 5000.0);
        BankAccount ca = new CurrentAccount("CA201", "Priya", 3000.0);

        try {
            sa.deposit(1000.0);
            sa.withdraw(2000.0);
            sa.withdraw(10000.0);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
            System.out.println("Final Balance for " + sa.getAccountHolderName() + ": " + sa.getBalance());
        }

        try {
            ca.deposit(500.0);
            ca.withdraw(2800.0);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
            System.out.println("Final Balance for " + ca.getAccountHolderName() + ": " + ca.getBalance());
        }
    }
}