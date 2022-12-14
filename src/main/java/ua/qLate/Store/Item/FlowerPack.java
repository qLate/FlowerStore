package ua.qLate.Store.Item;

import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.FlowerType;

public class FlowerPack extends Item {
    private final Flower flower;
    private final int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;

        description = "This is " + flower.getFlowerType() + "pack.";
    }

    public FlowerType GetFlowerType() {
        return flower.getFlowerType();
    }

    @Override
    public double price() {return quantity * flower.getPrice();}
}
