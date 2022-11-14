package ua.qLate.Store.Item;

public abstract class Item {
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract double price();
}
