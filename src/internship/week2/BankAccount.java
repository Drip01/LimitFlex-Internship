package internship.week2;

   class BankAccount {
       int balance = 10000;
       public void initialBalance(int myBalance) {
           System.out.println("initial balance: " + "$" + balance);
       }

       public void deposit(int MoneyDeposited) {
           balance = balance + MoneyDeposited;
           System.out.println("Deposited to your account: $" + MoneyDeposited);
           System.out.println("Available Balance:" + "$" + balance);
       }

       public void withdraw(int MoneyWithdrawn) {
           if (MoneyWithdrawn > balance) {
               System.out.println("Insufficient funds");
           }
           else {
               balance = balance - MoneyWithdrawn;
               System.out.println("Money withdrawn from the account. $" + MoneyWithdrawn);
               System.out.println("Available Balance:" + "$" + balance);
           }
       }

       public static void main(String[] args) {
           BankAccount myAccount = new BankAccount();
           myAccount.initialBalance(0);
           myAccount.deposit(50000);
           myAccount.withdraw(250000);
       }

}



