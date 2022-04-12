package main.ua.lviv.iot.lab2.models;

public class FishingReel extends AbstractFishingTackle {
    private float lengthInM;
    private int maxLoadInKilo;

    public FishingReel(String name, float price, int amount, TypeOfFishing typeOfFishing, float lengthInM, int maxLoadInKilo) {
        super(name, price, amount, typeOfFishing);
        this.lengthInM = lengthInM;
        this.maxLoadInKilo = maxLoadInKilo;
    }

    public float getLengthInM() {
        return lengthInM;
    }

    public void setLengthInM(float lengthInM) {
        this.lengthInM = lengthInM;
    }

    public int getMaxLoadInKilo() {
        return maxLoadInKilo;
    }

    public void setMaxLoadInKilo(int maxLoadInKilo) {
        this.maxLoadInKilo = maxLoadInKilo;
    }
}
