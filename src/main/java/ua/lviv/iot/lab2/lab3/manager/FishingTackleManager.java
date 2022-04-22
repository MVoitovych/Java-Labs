package ua.lviv.iot.lab2.lab3.manager;


import lombok.AllArgsConstructor;
import ua.lviv.iot.lab2.models.AbstractFishingTackle;
import ua.lviv.iot.lab2.models.TypeOfFishing;
import ua.lviv.iot.lab2.models.TypeOfSort;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class FishingTackleManager {
    private List<AbstractFishingTackle> tackles ;


    public List<AbstractFishingTackle> sortTackleByPrice(TypeOfSort type) {
        List<AbstractFishingTackle> finalList = tackles;
        if (type == TypeOfSort.ASCENDING) {
            finalList.sort((o1, o2) -> Float.compare(o1.getPriceInUah(), o2.getPriceInUah()));

        } else if (type == TypeOfSort.DESCENDING) {
            finalList.sort((o1, o2) -> -Float.compare(o1.getPriceInUah(), o2.getPriceInUah()));
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

    public List<AbstractFishingTackle> findTackleByTypeOfFishing(TypeOfFishing neededType) {

        return tackles.stream().filter(tackle -> tackle.getTypeOfFishing().equals(neededType)).collect(Collectors.toList());
    }

}
