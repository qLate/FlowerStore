package ua.qLate.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.qLate.Logic.Delivery.IDelivery;
import ua.qLate.Services.DeliveryService;
import ua.qLate.Store.Item.Flower.Flower;

import java.util.List;

@RestController
@RequestMapping("api/v1/delivery")
public class DeliveryController {
    private final DeliveryService service;

    @Autowired
    public DeliveryController(DeliveryService service) {
        this.service = service;
    }
    @GetMapping
    public List<IDelivery> getDeliveries() {
        return service.getDeliveries();
    }
}
