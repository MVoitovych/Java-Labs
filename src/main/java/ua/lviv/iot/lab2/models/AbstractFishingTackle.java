package ua.lviv.iot.lab2.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractFishingTackle {
    private String name;
    private float priceInUah;
    private int amount;
    private TypeOfFishing typeOfFishing;

    public AbstractFishingTackle(String name, float priceInUah, int amount, TypeOfFishing typeOfFishing) {
        this.name = name;
        this.priceInUah = priceInUah;
        this.amount = amount;
        this.typeOfFishing = typeOfFishing;
    }

    public String getHeaders() {
        return "name,priceInUah,amount,TypeOfFishing";
    }

    public String toCSV() {
        return name + "," + priceInUah + "," + amount + "," + typeOfFishing;
    }
}
