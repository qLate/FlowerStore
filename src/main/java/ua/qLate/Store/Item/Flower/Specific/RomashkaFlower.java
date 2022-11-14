package ua.qLate.Store.Item.Flower.Specific;

import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.FlowerColor;
import ua.qLate.Store.Item.Flower.FlowerType;

public class RomashkaFlower extends Flower {
    public RomashkaFlower() {
        flowerType = FlowerType.ROMASHKA;
        color = FlowerColor.WHITE;
        price = 3;
        sepalLength = 2.5;
        description = "This is romashka.";
    }
}

