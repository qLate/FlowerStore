package ua.qLate.Service.Payment;

public class CreditCardPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("Paying with credit card...");
    }
}
