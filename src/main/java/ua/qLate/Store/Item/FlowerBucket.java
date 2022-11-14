package ua.qLate.Store.Item;

import ua.qLate.Store.Item.Flower.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket(){
        description = "This is flower bucket.";
    }

    public void add(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice() {
        return flowerPacks.stream().mapToDouble(FlowerPack::price).sum();
    }
    public boolean ContainsFlowerType(FlowerType type) {
        return flowerPacks.stream().anyMatch(pack -> pack.GetFlowerType() == type);
    }

    @Override
    public double price() {return getPrice();}
}

