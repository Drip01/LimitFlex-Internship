package internship.week2;

 class MyBankAccount {
     double Balance = 50000;

     public void interest(double interestRate) {
         System.out.println("Interest rate: " + interestRate + "%");
     }
 }

 class SavingsAccount extends MyBankAccount {
     public void interest(double interestRate) {
         Balance = Balance + interestRate;
         System.out.println("New balance: $" + Balance);
     }
 }
 public class BankAccountWithInterest {
     public static void main (String[] args) {
         SavingsAccount savings = new SavingsAccount();
         savings.interest(20);
        /* MyBankAccount bankAccount = new MyBankAccount();
         bankAccount.interest(20);*/
     }
}
