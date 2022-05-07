package ua.lviv.iot.lab2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FishingRodTest {
    FishingRod fishingRod = new FishingRod("Vudochka", 1200.001f, 1, TypeOfFishing.LAKE, 600, "Bamboo");


    @Test
    void getLengthInSm() throws Exception {
        Assertions.assertEquals(fishingRod.getLengthInSm(), 600);
    }

    @Test
    void getMaterialType() throws Exception {
        Assertions.assertEquals(fishingRod.getMaterialType(), "Bamboo");
    }

    @Test
    void setLengthInSm() throws Exception {
        fishingRod.setLengthInSm(404);
        Assertions.assertEquals(fishingRod.getLengthInSm(), 404);
    }

    @Test
    void setMaterialType() throws Exception {
        fishingRod.setMaterialType("steel");
        Assertions.assertEquals(fishingRod.getMaterialType(), "steel");
    }
}