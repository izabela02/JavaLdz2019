package Day_01_06.Zadanie168;

import Day_01_06.Zadanie167.Dziecko;

import java.util.Comparator;


public class SortByAge implements Comparator {
    private JakSortowac jakSortowac = JakSortowac.ROSNACO;

    public SortByAge(JakSortowac jakSortowac) {
        if (jakSortowac != null) {
            this.jakSortowac = jakSortowac;
        }
    }

    @Override
    // metoda porównująca parametry o1,o2 klasy object
    public int compare(Object o1, Object o2) {
        //jeśli o1 lub o2 nie są klasy Dziecko to zwracam 0, bo ich nie przestawiam
        if (!(o1 instanceof Dziecko) || !(o2 instanceof Dziecko)) {
            return 0;
        }
        //rzutowanie obiektów na dzieci
        Dziecko dziecko1 = (Dziecko) o1;
        Dziecko dziecko2 = (Dziecko) o2;

        // w zależności od parametru przekazanego w konstruktorze posortuj rosnąco lub malejąco
        switch (jakSortowac) {
            case MALEJACO:
                return dziecko2.getAge() - dziecko1.getAge();
            case ROSNACO:
                return dziecko1.getAge() - dziecko2.getAge();

        }
        return 0;
    }

    enum JakSortowac {
        MALEJACO,
        ROSNACO
    }
}
