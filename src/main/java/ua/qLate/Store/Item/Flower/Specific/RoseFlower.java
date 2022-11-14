package ua.qLate.Store.Item.Flower.Specific;

import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.FlowerColor;
import ua.qLate.Store.Item.Flower.FlowerType;

public class RoseFlower extends Flower {
    public RoseFlower() {
        flowerType = FlowerType.ROSE;
        color = FlowerColor.RED;
        price = 5;
        sepalLength = 2;
        description = "This is rose.";
    }
}
