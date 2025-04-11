package internship.week2;

public class SecureAccount {
    String accountName;
    double balance;
    String accountNumber;

    public SecureAccount(String accountName, String accountNumber, double initialBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public static void main(String[] args) {
        SecureAccount account = new SecureAccount("Bad Therapist", "21070189", 500.0);
        System.out.println("internship.account.Account name: " + account.getAccountName());
        System.out.println("internship.account.Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(300.0);
        account.withdraw(100.0);
        account.withdraw(1000.0);
        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}


