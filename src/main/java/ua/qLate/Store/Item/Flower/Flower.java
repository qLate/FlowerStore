package ua.qLate.Store.Item.Flower;

import ua.qLate.Store.Item.Item;
import lombok.Getter;

public class Flower extends Item {
    @Getter
    protected double sepalLength;
    protected FlowerColor color;
    @Getter
    protected double price;

    protected FlowerType flowerType;


    public String getColor() {
        return color.toString();
    }
    public final FlowerType getFlowerType() {
        return flowerType;
    }

    @Override
    public double price() {return price;}
}

