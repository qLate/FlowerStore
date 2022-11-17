package ua.qLate.Store.Item.Flower;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.qLate.Store.Item.Item;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Getter
public class Flower extends Item {
    protected double sepalLength;
    protected FlowerColor color;
    protected double price;

    protected FlowerType flowerType;

    @Id @GeneratedValue
    private Long id;

    public FlowerType getFlowerType() {
        return flowerType;
    }

    @Override
    public double price() {return price;}
}

