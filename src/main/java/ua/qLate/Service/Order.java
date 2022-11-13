package ua.qLate.Service;

import ua.qLate.Service.Delivery.IDelivery;
import ua.qLate.Service.Payment.IPayment;
import ua.qLate.Store.Item.Item;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private IPayment payment;
    private IDelivery delivery;


    public void SetPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }
    public void SetDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public double CalculateTotalPrice() {
        return items.stream().mapToDouble(Item::price).sum();
    }
    public void ProcessOrder() {

    }

    public void AddItem(Item item) {
        items.add(item);
    }
    public void RemoveItem(Item item) {
        items.remove(item);
    }
}
