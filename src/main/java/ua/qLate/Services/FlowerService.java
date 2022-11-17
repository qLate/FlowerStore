package ua.qLate.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.qLate.Repositories.FlowerRepository;
import ua.qLate.Store.Item.Flower.Flower;
import ua.qLate.Store.Item.Flower.Specific.RomashkaFlower;
import ua.qLate.Store.Item.Flower.Specific.RoseFlower;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private final FlowerRepository repository;
    public FlowerService(FlowerRepository repository) {this.repository = repository;}

    public List<Flower> getFlowers() {
        return repository.findAll();
    }
    public void addFlower(Flower flower) {
        repository.save(flower);
    }
}
