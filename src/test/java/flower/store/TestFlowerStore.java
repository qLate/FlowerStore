package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.qLate.Store.FlowerStore;
import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.FlowerType;
import ua.qLate.Store.Item.Flower.Specific.CactusFlower;
import ua.qLate.Store.Item.Flower.Specific.RomashkaFlower;
import ua.qLate.Store.Item.Flower.Specific.RoseFlower;
import ua.qLate.Store.Item.FlowerBucket;
import ua.qLate.Store.Item.FlowerPack;

class TestFlowerStore {

    @Test
    public void TestFlowerStore() {
        FlowerStore store = new FlowerStore();

        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.add(new FlowerPack(new RomashkaFlower(), 4));
        bucket1.add(new FlowerPack(new RoseFlower(), 4));
        bucket1.add(new FlowerPack(new CactusFlower(), 4));
        FlowerBucket bucket2 = new FlowerBucket();
        bucket2.add(new FlowerPack(new CactusFlower(), 8));

        store.AddBucket(bucket1);
        store.AddBucket(bucket2);

        Assertions.assertEquals(store.Search(FlowerType.ROMASHKA).size(), 1);
        Assertions.assertEquals(store.Search(FlowerType.CACTUS).size(), 2);
        Assertions.assertEquals(store.Search(FlowerType.ROSE).size(), 1);
    }
}
