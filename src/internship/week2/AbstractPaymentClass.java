package internship.week2;

abstract class Payment {
    public abstract void processPayment();
}


class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Withdraw money with credit card");
    }
}


class PayPalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Withdraw money with paypal");
    }
}


public class AbstractPaymentClass {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}

