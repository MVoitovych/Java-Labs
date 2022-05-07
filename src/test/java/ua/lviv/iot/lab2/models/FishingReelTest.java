package ua.lviv.iot.lab2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FishingReelTest {
    FishingReel string = new FishingReel("Zhylka", 1200.002f, 3, TypeOfFishing.LAKE, 50, 25);


    @Test
    void getLengthInM() throws Exception {
        Assertions.assertEquals(string.getLengthInM(), 50);
    }

    @Test
    void getMaxLoadInKilo() throws Exception {
        Assertions.assertEquals(string.getMaxLoadInKilo(), 25);
    }

    @Test
    void setLengthInM() throws Exception {
        string.setLengthInM(51);
        Assertions.assertEquals(string.getLengthInM(), 51);
    }

    @Test
    void setMaxLoadInKilo() throws Exception {
        string.setMaxLoadInKilo(26);
        Assertions.assertEquals(string.getMaxLoadInKilo(), 26);
    }
}