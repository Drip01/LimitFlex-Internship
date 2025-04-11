package internship.account;

public class Main {
    public static void main(String[] args) {

       Account dripAccount = new Account("12345", 500.00, "Drip", "09060063229", "maduabuchimarvelous@gmail.com");

       System.out.println(dripAccount.getNumber());
       System.out.println(dripAccount.getBalance());

       /* dripAccount.setNumber("12345");
        dripAccount.setBalance(1000.0);
        dripAccount.setCustomerName("Drip");
        dripAccount.setCustomerEmail("maduabuchimarvelous@gmail.com");
        dripAccount.setCustomerPhone("09060063229");*/

        dripAccount.withdrawFunds(100.0);
        dripAccount.depositFunds(250);
        dripAccount.withdrawFunds(50);

        dripAccount.withdrawFunds(200);

        dripAccount.depositFunds(100);
        dripAccount.withdrawFunds(45.55);
        dripAccount.withdrawFunds(54.46);

        dripAccount.withdrawFunds(54.45);

        Account herAccount = new Account("Her",
                "her@gmail.com", "12345");
        System.out.println("AccountNo: " + herAccount.getNumber() +
                "; name " + herAccount.getCustomerName());
    }
}
