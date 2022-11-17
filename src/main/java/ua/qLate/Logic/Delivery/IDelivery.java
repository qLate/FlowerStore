package ua.qLate.Logic.Delivery;

import ua.qLate.Store.Item.Item;

import java.util.LinkedList;

public interface IDelivery {
    void Deliver(LinkedList<Item> items);
}
