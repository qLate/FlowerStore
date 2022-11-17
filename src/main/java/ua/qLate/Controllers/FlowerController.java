package ua.qLate.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.qLate.Services.FlowerService;
import ua.qLate.Store.Item.Flower.Flower;

import java.util.List;

@RestController
@RequestMapping("api/v1/flower")
public class FlowerController {
    private final FlowerService service;

    @Autowired
    public FlowerController(FlowerService service) {
        this.service = service;
    }
    @GetMapping
    public List<Flower> getFlowers() {
        return service.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        service.addFlower(flower);
    }
}
