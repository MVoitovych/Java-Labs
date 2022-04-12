package main.ua.lviv.iot.lab2.models;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TypeOfFishing getTypeOfFishing() {
        return typeOfFishing;
    }

    public void setTypeOfFishing(TypeOfFishing typeOfFishing) {
        this.typeOfFishing = typeOfFishing;
    }
}
