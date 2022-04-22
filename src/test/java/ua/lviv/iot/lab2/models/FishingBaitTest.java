package ua.lviv.iot.lab2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FishingBaitTest {
    FishingBait bait = new FishingBait("Chervyak", 2.5F, 500, TypeOfFishing.RIVER, true);

    @Test
    void isAlive() throws Exception {
        Assertions.assertTrue(bait.isAlive());
    }

    @Test
    void setAlive() throws Exception {
        bait.setAlive(false);
        Assertions.assertFalse(bait.isAlive());
    }
}