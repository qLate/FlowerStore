package ua.qLate.Logic.Payment;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public interface IPayment {
    void pay(double price);
}
