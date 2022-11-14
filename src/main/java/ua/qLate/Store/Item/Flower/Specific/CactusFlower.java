package ua.qLate.Store.Item.Flower.Specific;

import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.FlowerColor;
import ua.qLate.Store.Item.Flower.FlowerType;

public class CactusFlower extends Flower {
    public CactusFlower() {
        flowerType = FlowerType.CACTUS;
        color = FlowerColor.GREEN;
        price = 2;
        sepalLength = 1;
        description = "This is cactus.";
    }
}
