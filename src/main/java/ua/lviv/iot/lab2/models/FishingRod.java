package ua.lviv.iot.lab2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishingRod extends AbstractFishingTackle {
    private float lengthInSm;
    private String materialType;

    public FishingRod(String name, float price, int amount, TypeOfFishing typeOfFishing, float lengthInSm, String materialType) {
        super(name, price, amount, typeOfFishing);
        this.lengthInSm = lengthInSm;
        this.materialType = materialType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "lengthInSm,materialType";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + lengthInSm + "," + materialType;
    }
}
