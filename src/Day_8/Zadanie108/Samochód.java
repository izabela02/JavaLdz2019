package Day_8.Zadanie108;

public class Samochód {
    private boolean czyDziała;
    private String nazwa;
    private Color kolor;

    Samochód(boolean czyDziała, String nazwa, Color kolor) {
        this.czyDziała = czyDziała;
        this.nazwa =nazwa;
        this.kolor = kolor;
    }
    public String toString () {
        String działa = (czyDziała) ?  "Działa" :  "Nie działa";
        StringBuilder sb = new StringBuilder();
        sb.append("Samochód: ")
                .append(nazwa)
                .append(" o kolorze: ")
                .append(kolor)
                .append((czyDziała) ?  " Działa" :  " Nie działa");
        return sb.toString();

    }

}

//typ wyliczeniowy
enum Color {
    Czerwony, Niebieski, Biały, Czarny, Srebrny;
}