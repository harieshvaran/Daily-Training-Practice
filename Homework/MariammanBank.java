
class MariammanBank {
    static String bankName = "Mariamman Indian Bank";
    private int accountNumber;
    private String accountHolderName;
    private double mobileNumber;
    private String accountType;
    private double balance;

    MariammanBank(int accountNumber, String accountHolderName, double mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    
// 7. IMPORTANT – DO NOT CREATE SETTERS FOR EVERYTHING
// ============================================================

// Do NOT blindly create setters for every variable.

// The following variables should NOT have setters:

//     accountNumber
//     balance
//     accountType

// Reason:

// ACCOUNT NUMBER:
// The account number is assigned by the bank and should not be changed
// by the customer.

// BALANCE:
// The customer should not directly set the balance.

// For example, this should NOT be allowed:

//     account.setBalance(500000);

// The balance should change only through proper banking operations such
// as:

//     deposit()
//     withdraw()


// ACCOUNT TYPE:
// The account type is decided when the account is created and should
// not be directly changed by the customer.




}






