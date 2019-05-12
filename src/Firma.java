/*Utwórz klasę `Firma` posiadającą
>*pola reprezentujące:*
> - nazwę firmy
> - rok założenia
> - tablicę pracowników

>*metody umożliwiające:*
> - zatrudnienie pracownika - jeśli to możliwe (jeśli nie, zwrócić wartość `false`)
> - zwolnienie pracownika
> - zmianę nazwy firmy

 */

public class Firma {
    private String name;
    private int year;
    private Pracownik[] workers = new Pracownik[5];


    Firma(String name, int year) {
        this.name = name;
        this.year = year;


    }

    void changeCompanyName(String newName) { // nowa metoda, która nic nie zwraca
        name = newName; // zmiana nazwy firmy

    }

    public void setName(String name, int year) {
        this.name = name;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Firma(" +
                "name='" + name + '\'' +
                ", year=" + year
                + '}';
    }

    public boolean dodawaniePracownika(Pracownik newWorker) {
        for (int i = 0; i < workers.length; i++) {
            // musimy trafić na pierwsze wolne miejsce w tablicy
            if (workers[i] == null) ;
            //na tę wolną pozycję wstawiamy nowego pracownika
            workers[i] = newWorker;
            return true;

        }

        return false;







    }

}

