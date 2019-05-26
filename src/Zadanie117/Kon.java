package Zadanie117;

public class Kon implements Interakcja {
    private String imie;
    private int wiek;
    private String rasa;

    public Kon(String imie, int wiek, String rasa) {
        this.imie = imie;
        this.wiek = wiek;
        this.rasa = rasa;
    }

    @Override
    public String dajGlos() {
        return "Ihaaaa";
    }
}
