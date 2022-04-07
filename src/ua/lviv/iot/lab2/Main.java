package ua.lviv.iot.lab2;


import ua.lviv.iot.lab2.manager.FishingTackleManager;
import ua.lviv.iot.lab2.models.*;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String... strings) {

        AbstractFishingTackle fishingRod = new FishingRod("Vudochka", 1200.001f, 1, TypeOfFishing.LAKE, 600, "Bamboo");
        AbstractFishingTackle string = new FishingReel("Zhylka", 1200.002f, 3, TypeOfFishing.LAKE, 50, 25);
        AbstractFishingTackle wear = new FishingWear("Gumaky", 300, 50, TypeOfFishing.RIVER, "Rubber", true);
        AbstractFishingTackle bait = new FishingBait("Chervyak", 2.5F, 500, TypeOfFishing.RIVER, true);
        List<AbstractFishingTackle> objList = new LinkedList<>();
        objList.add(fishingRod);
        objList.add(string);
        objList.add(wear);
        objList.add(bait);


        FishingTackleManager manager = new FishingTackleManager(objList);

        TypeOfFishing neededType = TypeOfFishing.LAKE;

        System.out.println(neededType + " Type:");
        manager.sortTackleByTypeOfFishing(neededType).forEach(
                tackle -> System.out.println(tackle.getName() + " " + tackle.getType()));
        System.out.println("--------------");

        System.out.println("Alphabet:");
        manager.sortTackleByAlphabet(TypeOfSort.ASCENDING).forEach(
                tackle -> System.out.println(tackle.getName()));
        System.out.println("--------------");

        manager.sortTackleByAlphabet(TypeOfSort.DESCENDING).forEach(
                tackle -> System.out.println(tackle.getName()));
        System.out.println("--------------");

        System.out.println("Price:");
        manager.sortTackleByPrice(TypeOfSort.ASCENDING).forEach(
                tackle -> System.out.println(tackle.getName() + " " + tackle.getPrice()));
        System.out.println("--------------");

        manager.sortTackleByPrice(TypeOfSort.DESCENDING).forEach(
                tackle -> System.out.println(tackle.getName() + " " + tackle.getPrice()));
        System.out.println("--------------");
    }
}
