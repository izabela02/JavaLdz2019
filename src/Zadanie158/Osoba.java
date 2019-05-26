package Zadanie158;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private boolean czyAktywny;


    public Osoba(String imie, String nazwisko, int wiek, boolean czyAktywny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.czyAktywny = czyAktywny;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", czyAktywny=" + czyAktywny +
                '}';
    }
}
