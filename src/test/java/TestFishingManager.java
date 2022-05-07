import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.lab3.manager.FishingTackleManager;
import ua.lviv.iot.lab2.models.*;

import java.util.LinkedList;
import java.util.List;

public class TestFishingManager {

    List<AbstractFishingTackle> createList() {
        FishingRod fishingRod = new FishingRod("Vudochka", 1200.001f, 1, TypeOfFishing.LAKE, 600, "Bamboo");
        FishingReel string = new FishingReel("Zhylka", 1200.002f, 3, TypeOfFishing.LAKE, 50, 25);
        FishingWear wear = new FishingWear("Gumaky", 300, 50, TypeOfFishing.RIVER, "Rubber", true);
        FishingBait bait = new FishingBait("Chervyak", 2.5F, 500, TypeOfFishing.RIVER, true);

        List<AbstractFishingTackle> objList = new LinkedList<>();
        objList.add(fishingRod);
        objList.add(string);
        objList.add(wear);
        objList.add(bait);
        return objList;
    }


    @Test
    public void testAscendingSortTackleByPrice() throws Exception {
        FishingTackleManager manager = new FishingTackleManager();
        List<AbstractFishingTackle> sortedList = manager.sortTackleByPrice(TypeOfSort.ASCENDING, createList());
        for (int i = 0; i < sortedList.size() - 1 ; i++) {
            Assertions.assertTrue((sortedList.get(i).getPriceInUah() <= sortedList.get(i + 1).getPriceInUah()));
        }
    }

    @Test
    public void testDescendingSortTackleByPrice() throws Exception {
        FishingTackleManager manager = new FishingTackleManager();
        List<AbstractFishingTackle> sortedList = manager.sortTackleByPrice(TypeOfSort.DESCENDING, createList());
        for (int i = 0; i < sortedList.size() - 1; i++) {
            Assertions.assertTrue((sortedList.get(i).getPriceInUah() >= sortedList.get(i + 1).getPriceInUah()));
        }
    }

    @Test
    public void testAscendingSortTackleByAlphabet() throws Exception {
        FishingTackleManager manager = new FishingTackleManager();
        List<AbstractFishingTackle> sortedList = manager.sortTackleByAlphabet(TypeOfSort.ASCENDING, createList());
        for (int i = 0; i < sortedList.size() - 1; i++) {
            Assertions.assertTrue(sortedList.get(i).getName().compareTo(sortedList.get(i + 1).getName()) <= 0);
        }
    }

    @Test
    public void testDescendingSortTackleByAlphabet() throws Exception {
        FishingTackleManager manager = new FishingTackleManager();
        List<AbstractFishingTackle> sortedList = manager.sortTackleByAlphabet(TypeOfSort.DESCENDING, createList());
        for (int i = 0; i < sortedList.size() - 1; i++) {
            Assertions.assertTrue(sortedList.get(i).getName().compareTo(sortedList.get(i + 1).getName()) >= 0);
        }
    }

    @Test
    public void testFindTackleByTypeOfFishing() throws Exception {
        FishingTackleManager manager = new FishingTackleManager();
        TypeOfFishing type = TypeOfFishing.LAKE;
        manager.findTackleByTypeOfFishing(type, createList()).forEach(tackle -> Assertions.assertEquals(tackle.getTypeOfFishing(), type));
    }
}
