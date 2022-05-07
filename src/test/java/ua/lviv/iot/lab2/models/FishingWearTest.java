package ua.lviv.iot.lab2.models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FishingWearTest {

    FishingWear wear = new FishingWear("Gumaky", 300, 50, TypeOfFishing.RIVER, "Rubber", true);

    @Test
    void getMaterialType() throws Exception {
        Assertions.assertEquals(wear.getMaterialType(), "Rubber");
    }

    @Test
    void isWaterProof() throws Exception {
        Assertions.assertTrue(wear.isWaterProof());
    }

    @Test
    void setMaterialType() throws Exception {
        wear.setMaterialType("material1");
        Assertions.assertEquals(wear.getMaterialType(), "material1");
    }

    @Test
    void setWaterProof() throws Exception {
        wear.setWaterProof(false);
        Assertions.assertFalse(wear.isWaterProof());
    }

    @Test
    void setName() throws Exception{
        wear.setName("UberGumaky");
        Assertions.assertEquals(wear.getName(), "UberGumaky");
    }

    @Test
    void setPriceInUah() throws Exception{
        wear.setPriceInUah(404);
        Assertions.assertEquals(wear.getPriceInUah(), 404);
    }
    @Test
    void setAmount() throws Exception{
        wear.setAmount(51);
        Assertions.assertEquals(wear.getAmount(), 51);
    }
    @Test
    void setTypeOfFishing() throws Exception {
        wear.setTypeOfFishing(TypeOfFishing.LAKE);
        Assertions.assertEquals(wear.getTypeOfFishing(), TypeOfFishing.LAKE);
    }
}
