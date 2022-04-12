package main.ua.lviv.iot.lab2.models;

public class FishingBait extends AbstractFishingTackle {

    private boolean isAlive;

    public FishingBait(String name, float price, int amount, TypeOfFishing typeOfFishing, boolean isAlive) {
        super(name, price, amount, typeOfFishing);
        this.isAlive = isAlive;
    }


    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
