package ua.qLate.Store.Item.Decorator;

import ua.qLate.Store.Item.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }
    @Override

    public String getDescription() {
        return item.getDescription();
    }
    @Override
    public double price() {
        return 13 + item.price();
    }
}
