package ua.lviv.iot.lab2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishingWear extends AbstractFishingTackle {
    private String materialType ;
    private boolean isWaterProof ;

    public FishingWear(String name, float price, int amount, TypeOfFishing typeOfFishing, String materialType, boolean isWaterProof) {
        super(name, price, amount, typeOfFishing);
        this.materialType = materialType;
        this.isWaterProof = isWaterProof;
    }
}