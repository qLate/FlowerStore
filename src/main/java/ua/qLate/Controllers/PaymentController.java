package ua.qLate.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.qLate.Service.Delivery.IDelivery;
import ua.qLate.Service.Payment.IPayment;

import java.util.List;

@RestController
@RequestMapping("payment")
public class PaymentController {
    public List<IPayment> payments;

    @GetMapping
    public List<IPayment> all() {return payments;}
}
