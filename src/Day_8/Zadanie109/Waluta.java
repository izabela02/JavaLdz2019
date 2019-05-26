package Day_8.Zadanie109;

public class Waluta {
    private int kursSprzedaży;
    private boolean kursKupna;
    private TypWaluty typ;

    Waluta(int kursSprzedaży, boolean kursKupna, TypWaluty typ) {
        this.kursKupna = kursKupna;
        this.kursSprzedaży = kursSprzedaży;
        this.typ = typ;

    }

}
