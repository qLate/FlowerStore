package ua.qLate.Store.Item.Decorator;

import ua.qLate.Store.Item.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;
    public abstract String getDescription();

    public ItemDecorator(Item item) {
        this.item = item;
    }
}
