package ua.qLate.Store.Item;

import lombok.Getter;

public abstract class Item {
    @Getter
    public String description;

    public abstract double price();
}
