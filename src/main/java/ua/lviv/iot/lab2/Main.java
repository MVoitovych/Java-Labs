package ua.lviv.iot.lab2;


import ua.lviv.iot.lab2.lab3.manager.FishingTackleManager;
import ua.lviv.iot.lab2.models.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FishingRod fishingRod = new FishingRod("Vudochka", 1200.001f, 1, TypeOfFishing.LAKE, 600, "Bamboo");
        FishingReel string = new FishingReel("Zhylka", 1200.002f, 3, TypeOfFishing.LAKE, 50, 25);
        FishingWear wear = new FishingWear("Gumaky", 300, 50, TypeOfFishing.RIVER, "Rubber", true);
        FishingBait bait = new FishingBait("Chervyak", 2.5F, 500, TypeOfFishing.RIVER, true);

        List<AbstractFishingTackle> objList = new LinkedList<>();
        objList.add(fishingRod);
        objList.add(string);
        objList.add(wear);
        objList.add(bait);


        FishingTackleManager manager = new FishingTackleManager(objList);

        TypeOfFishing neededType = TypeOfFishing.LAKE;

        System.out.println(neededType + " Type:");
        manager.findTackleByTypeOfFishing(neededType).forEach(
                tackle -> System.out.println(tackle.getName() + " " + tackle.getType()));
        System.out.println("-------ASCENDING-------");

        System.out.println("Alphabet:");
        manager.sortTackleByAlphabet(TypeOfSort.ASCENDING).forEach(
                tackle -> System.out.println(tackle.getName()));
        System.out.println("-------DESCENDING-------");

        manager.sortTackleByAlphabet(TypeOfSort.DESCENDING).forEach(
                tackle -> System.out.println(tackle.getName()));
        System.out.println("-------ASCENDING-------");

        System.out.println("Price:");
        manager.sortTackleByPrice(TypeOfSort.ASCENDING).forEach(
                tackle -> System.out.println(tackle.getName() + " " + tackle.getPriceInUah()));
        System.out.println("-------DESCENDING-------");

        manager.sortTackleByPrice(TypeOfSort.DESCENDING).forEach(
                tackle -> System.out.println(tackle.getName() + " " + tackle.getPriceInUah()));
        System.out.println("------------------------");

    }
}
