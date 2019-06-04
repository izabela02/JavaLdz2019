package Day_01_06.Zadanie168;

import Day_01_06.Zadanie167.Dziecko;

import java.util.Comparator;

public class SortByFullName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if (!(o1 instanceof Dziecko) || !(o2 instanceof Dziecko)) {
                return 0;
            }

            Dziecko dziecko1 = (Dziecko) o1;
            Dziecko dziecko2 = (Dziecko) o2;
// zmienna int do której przypisany jest wynik porównania imion obydwóch parametrów
            int compareName = dziecko1.getName().compareTo(dziecko2.getName());
// Jesli imiona są identyczne porównujemy po nazwisku
            if (compareName == 0) {
                return dziecko1.getLastName().compareTo(dziecko2.getLastName());
            }
// zwracamy wynik porownania po imioniach
            return compareName;
        }
    }


