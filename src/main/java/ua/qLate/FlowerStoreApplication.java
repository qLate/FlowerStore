package ua.qLate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import ua.qLate.Store.Item.Decorator.PaperDecorator;
import ua.qLate.Store.Item.Decorator.RibbonDecorator;
import ua.qLate.Store.Item.Flower.Specific.RoseFlower;
import ua.qLate.Store.Item.FlowerBucket;
import ua.qLate.Store.Item.FlowerPack;
import ua.qLate.Store.Item.Item;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);

        Item item = new FlowerBucket();
        ((FlowerBucket) item).add(new FlowerPack(new RoseFlower(), 4));
        System.out.println(item.price());

        item = new RibbonDecorator(item);
        System.out.println(item.price());

        item = new PaperDecorator(item);
        System.out.println(item.price());
    }
}
