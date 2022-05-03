package ua.lviv.iot.lab2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishingBait extends AbstractFishingTackle {

    private boolean isAlive;

    public FishingBait(String name, float price, int amount, TypeOfFishing typeOfFishing, boolean isAlive) {
        super(name, price, amount, typeOfFishing);
        this.isAlive = isAlive;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "isAlive";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + isAlive;
    }
}
