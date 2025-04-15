package internship.week2;

abstract class Payment {
    public abstract void processPayment(double amount);
}


class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Withdraw money with credit card $" + amount);
    }
}


class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Withdraw money with paypal $" + amount);
    }
}


public class AbstractPaymentClass {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        creditCardPayment.processPayment(150);
        payPalPayment.processPayment(65);
    }
}

