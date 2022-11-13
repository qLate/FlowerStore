package ua.qLate.Controllers;

import ua.qLate.Store.Item.Flower.Specific.RomashkaFlower;
import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.Specific.RoseFlower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("flower")
public class FlowerController {

    @GetMapping
    public List<Flower> test() {return List.of(new RoseFlower(), new RomashkaFlower());}
}
