package ua.lviv.iot.lab2.models;

public abstract class AbstractFishingTackle {
    protected String name;
    protected float priceInUah;
    protected int amount;
    protected TypeOfFishing typeOfFishing;

    public AbstractFishingTackle(String name, float price, int amount, TypeOfFishing typeOfFishing) {
        this.name = name;
        this.priceInUah = price;
        this.amount = amount;
        this.typeOfFishing = typeOfFishing;
    }


    public String getName() {
        return name;
    }

    public float getPriceInUah() {
        return priceInUah;
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

    public void setPriceInUah(float priceInUah) {
        this.priceInUah = priceInUah;
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
