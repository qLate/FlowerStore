package ua.qLate.Logic.Payment;

public class PayPalPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("Paying with PayPal...");
    }
}
