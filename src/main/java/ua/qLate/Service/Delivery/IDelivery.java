package ua.qLate.Service.Delivery;

import ua.qLate.Store.Item.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

public interface IDelivery {
    void Deliver(LinkedList<Item> items);
}
