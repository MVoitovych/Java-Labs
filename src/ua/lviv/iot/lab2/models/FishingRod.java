package ua.lviv.iot.lab2.models;

public class FishingRod extends AbstractFishingTackle {

    private float lengthInSm;
    private String materialType;


    public float getLengthInSm() {
        return lengthInSm;
    }

    public String getMaterialType() {
        return materialType;
    }


    public FishingRod(String name, float price, int amount, TypeOfFishing typeOfFishing, float lengthInSm, String materialType) {
        super(name, price, amount, typeOfFishing);
        this.lengthInSm = lengthInSm;
        this.materialType = materialType;
    }
}
