package ua.lviv.iot.lab2.models;

public class FishingWear extends AbstractFishingTackle {
    private String materialType = null;
    private boolean isWaterProof = false;


    public String getMaterialType() {
        return materialType;
    }

    public boolean isWaterProof() {
        return isWaterProof;
    }


    public FishingWear(String name, float price, int amount, TypeOfFishing typeOfFishing, String materialType, boolean isWaterProof) {
        super(name, price, amount, typeOfFishing);
        this.materialType = materialType;
        this.isWaterProof = isWaterProof;
    }
}
