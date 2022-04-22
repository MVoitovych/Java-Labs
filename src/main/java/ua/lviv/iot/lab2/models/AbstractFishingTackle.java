package ua.lviv.iot.lab2.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractFishingTackle {
    protected String name;
    protected float priceInUah;
    protected int amount;
    protected TypeOfFishing typeOfFishing;

}
