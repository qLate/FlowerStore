package ua.qLate.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.qLate.Service.Delivery.IDelivery;

import java.util.List;

@RestController
@RequestMapping("delivery")
public class DeliveryController {
    public List<IDelivery> deliveries;

    @GetMapping
    public List<IDelivery> all() {return deliveries;}
}
