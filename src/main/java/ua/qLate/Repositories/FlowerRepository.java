package ua.qLate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.qLate.Store.Item.Flower.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
