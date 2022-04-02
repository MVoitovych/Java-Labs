package ua.lviv.iot.lab2.models;

public abstract class AbstractFishingTackle {
    protected String name;
    protected float price;
    protected int amount;
    protected TypeOfFishing typeOfFishing;

    public AbstractFishingTackle(String name, float price, int amount, TypeOfFishing typeOfFishing) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.typeOfFishing = typeOfFishing;
    }


    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public TypeOfFishing getType() {
        return typeOfFishing;
    }

}
