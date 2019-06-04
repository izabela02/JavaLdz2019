package Day_01_06.Zadanie168;

import Day_01_06.Zadanie167.Dziecko;

import java.util.Comparator;

// Pierwsza ma sortować po imionach
public class SortByNames implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        if (!(o1 instanceof Dziecko) || !(o2 instanceof Dziecko)) {
            return 0;

        }

        Dziecko dziecko1 = (Dziecko)o1;
        Dziecko dziecko2 = (Dziecko)o2;

        return dziecko1.getName().compareTo(dziecko2.getName());
    }
}
