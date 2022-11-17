package ua.qLate.Services;

import org.springframework.stereotype.Service;
import ua.qLate.Logic.Delivery.DHLDeliveryStrategy;
import ua.qLate.Logic.Delivery.IDelivery;
import ua.qLate.Logic.Delivery.PostDeliveryStrategy;
import ua.qLate.Logic.Payment.CreditCardPaymentStrategy;
import ua.qLate.Logic.Payment.PayPalPaymentStrategy;

import java.util.List;

@Service
public class DeliveryService {
    public List<IDelivery> getDeliveries() {
        return List.of(new DHLDeliveryStrategy(), new PostDeliveryStrategy());
    }
}
