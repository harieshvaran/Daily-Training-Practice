// Q6. BANKING ACCOUNT SYSTEM

// A bank maintains different types of accounts.

// Common account information:
// - Account Number
// - Account Holder Name
// - Balance

// The bank supports:
// - Savings Account
// - Current Account

// All accounts must support:
// deposit()
// withdraw()

// But withdrawal rules differ.

// Savings account should maintain a minimum balance.

// Current account should support an overdraft limit.

// Requirements:
// - Create an abstract class Account.
// - Add common properties.
// - Add deposit().
// - Create an abstract withdraw().
// - Create SavingsAccount and CurrentAccount.
// - Override withdraw().
// - Demonstrate the system.

abstract class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    double minimumBalance;

    SavingsAccount(String accountNumber, String accountHolderName, double balance, double minimumBalance) {
        super(accountNumber, accountHolderName, balance);
        this.minimumBalance = minimumBalance;
    }

    void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Minimum balance requirement not met.");
        }
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }
}

class BankingMedium {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("S35", "maha", 1000, 500);
        savings.deposit(200);
        savings.withdraw(600); 
        savings.withdraw(400); 

        Account current = new CurrentAccount("CA8", "arunsound", 500, 300);
        current.deposit(100);
        current.withdraw(700); 
        current.withdraw(200); 
    }
}