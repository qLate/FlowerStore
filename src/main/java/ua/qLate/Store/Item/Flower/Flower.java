package ua.qLate.Store.Item.Flower;

import ua.qLate.Store.Item.Item;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    protected FlowerColor color;
    @Getter
    private double price;

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

