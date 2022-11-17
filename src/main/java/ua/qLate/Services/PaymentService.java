package ua.qLate.Services;

import org.springframework.stereotype.Service;
import ua.qLate.Logic.Delivery.IDelivery;
import ua.qLate.Logic.Payment.IPayment;

import java.util.List;

@Service
public class PaymentService {
    private List<IPayment> payments;

    public List<IPayment> getPayments() {
        return payments;
    }
    public void addPayment(IPayment payment) {
        payments.add(payment);
    }
}
