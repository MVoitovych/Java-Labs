package main.ua.lviv.iot.lab2.models;

public class FishingRod extends AbstractFishingTackle {
    private float lengthInSm;
    private String materialType;


    public void setLengthInSm(float lengthInSm) {
        this.lengthInSm = lengthInSm;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }


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
