package ua.qLate.Store.Item.Decorator;

import ua.qLate.Store.Item.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }
    @Override

    public String getDescription() {
        return item.getDescription();
    }
    @Override
    public double price() {
        return 40 + item.price();
    }
}
