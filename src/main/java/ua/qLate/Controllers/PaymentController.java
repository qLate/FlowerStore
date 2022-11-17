package ua.qLate.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.qLate.Logic.Payment.IPayment;
import ua.qLate.Services.PaymentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {
    private final PaymentService service;

    @Autowired
    public PaymentController(PaymentService service) {
        this.service = service;
    }
    @GetMapping
    public List<IPayment> getPayments() {
        return service.getPayments();
    }
}
