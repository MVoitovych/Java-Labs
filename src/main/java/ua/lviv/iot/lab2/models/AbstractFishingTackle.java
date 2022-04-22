package ua.lviv.iot.lab2.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractFishingTackle {
    protected String name;
    protected float priceInUah;
    protected int amount;
    protected TypeOfFishing typeOfFishing;

    public AbstractFishingTackle(String name, float priceInUah, int amount, TypeOfFishing typeOfFishing) {
        this.name = name;
        this.priceInUah = priceInUah;
        this.amount = amount;
        this.typeOfFishing = typeOfFishing;
    }
}
