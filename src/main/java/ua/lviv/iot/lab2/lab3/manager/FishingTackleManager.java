package ua.lviv.iot.lab2.lab3.manager;

import ua.lviv.iot.lab2.models.AbstractFishingTackle;
import ua.lviv.iot.lab2.models.TypeOfFishing;
import ua.lviv.iot.lab2.models.TypeOfSort;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FishingTackleManager {

    public List<AbstractFishingTackle> sortTackleByPrice(TypeOfSort type, List<AbstractFishingTackle> tackles) {
        if (type == TypeOfSort.ASCENDING) {
            tackles.sort((o1, o2) -> Float.compare(o1.getPriceInUah(), o2.getPriceInUah()));

        } else if (type == TypeOfSort.DESCENDING) {
            tackles.sort((o1, o2) -> Float.compare(o2.getPriceInUah(), o1.getPriceInUah()));
        }

        return tackles;
    }

    public List<AbstractFishingTackle> sortTackleByAlphabet(TypeOfSort type, List<AbstractFishingTackle> tackles) {

        if (type == TypeOfSort.ASCENDING) {
            tackles.sort(Comparator.comparing(AbstractFishingTackle::getName));

        } else if (type == TypeOfSort.DESCENDING) {
            tackles.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        }
        return tackles;
    }

    public List<AbstractFishingTackle> findTackleByTypeOfFishing(TypeOfFishing neededType, List<AbstractFishingTackle> tackles) {

        return tackles.stream().filter(tackle -> tackle.getTypeOfFishing().equals(neededType)).collect(Collectors.toList());
    }

}
