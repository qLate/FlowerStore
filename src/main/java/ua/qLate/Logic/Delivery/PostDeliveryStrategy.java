package ua.qLate.Logic.Delivery;


import ua.qLate.Store.Item.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements IDelivery {

    @Override
    public void Deliver(LinkedList<Item> items) {
        System.out.println("Delivering by Post");
    }
}
