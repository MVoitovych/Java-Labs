package ua.lviv.iot.lab2.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FishingReel extends AbstractFishingTackle {
    private float lengthInM;
    private int maxLoadInKilo;

    public FishingReel(String name, float price, int amount, TypeOfFishing typeOfFishing, float lengthInM, int maxLoadInKilo) {
        super(name, price, amount, typeOfFishing);
        this.lengthInM = lengthInM;
        this.maxLoadInKilo = maxLoadInKilo;
    }

}


