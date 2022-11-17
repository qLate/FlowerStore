package ua.qLate.Services;

import org.springframework.stereotype.Service;
import ua.qLate.Logic.Payment.CreditCardPaymentStrategy;
import ua.qLate.Logic.Payment.IPayment;
import ua.qLate.Logic.Payment.PayPalPaymentStrategy;
import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.Specific.RomashkaFlower;
import ua.qLate.Store.Item.Flower.Specific.RoseFlower;

import java.util.List;

@Service
public class PaymentService {
    public List<IPayment> getPayments() {
        return List.of(new PayPalPaymentStrategy(), new CreditCardPaymentStrategy());
    }
}
