package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.models.AbstractFishingTackle;
import ua.lviv.iot.lab2.models.TypeOfFishing;
import ua.lviv.iot.lab2.models.TypeOfSort;

import java.util.List;
import java.util.stream.Collectors;

public class FishingTackleManager {
    private List<AbstractFishingTackle> tackles = null;

    public FishingTackleManager(List<AbstractFishingTackle> tackles) {
        this.tackles = tackles;
    }


    public List<AbstractFishingTackle> sortTackleByPrice(TypeOfSort type) {
        List<AbstractFishingTackle> finalList = tackles;
        if (type == TypeOfSort.ASCENDING) {
            finalList.sort((o1, o2) -> {
                return Float.compare(o1.getPrice(), o2.getPrice());
            });


        } else if (type == TypeOfSort.DESCENDING) {
            finalList.sort((o1, o2) -> -Float.compare(o1.getPrice(), o2.getPrice()));
        }

        return finalList;
    }

    public List<AbstractFishingTackle> sortTackleByAlphabet(TypeOfSort type) {
        List<AbstractFishingTackle> finalList = tackles;

        if (type == TypeOfSort.ASCENDING) {
            finalList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        } else if (type == TypeOfSort.DESCENDING) {
            finalList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        }
        return finalList;
    }

    public List<AbstractFishingTackle> sortTackleByTypeOfFishing(TypeOfFishing neededType) {
        /*tackles.forEach(tackle ->{
            if (tackle.getType() == neededType) {finalList.add(tackle);}
        });
        запитати як краще*/
        return tackles.stream().filter(tackle -> tackle.getType().equals(neededType)).collect(Collectors.toList());
    }

}
