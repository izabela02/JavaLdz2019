package Zadanie117;

public class Kot implements Interakcja {
    private String imie;
    private int wiek;
    private String rasa;

    public Kot(String imie, int wiek, String rasa) {
        this.imie = imie;
        this.wiek = wiek;
        this.rasa = rasa;
    }

    @Override
    public String dajGlos() {
        return "MiauMiau";
    }

    @Override
    public String przedstawSie() {
        return "Jestem kotem.";
    }
}




