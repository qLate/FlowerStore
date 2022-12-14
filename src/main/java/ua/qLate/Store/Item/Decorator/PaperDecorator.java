package ua.qLate.Store.Item.Decorator;

import ua.qLate.Store.Item.Item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
    @Override
    public double price() {
        return 4 + item.price();
    }
}
