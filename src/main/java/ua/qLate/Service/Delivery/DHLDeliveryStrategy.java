package ua.qLate.Service.Delivery;


import ua.qLate.Store.Item.Item;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements IDelivery {

    @Override
    public void Deliver(LinkedList<Item> items) {
        System.out.println("Delivering by DHL");
    }
}
