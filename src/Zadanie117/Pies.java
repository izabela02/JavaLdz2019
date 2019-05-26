package Zadanie117;

public class Pies implements Interakcja{
    private String imie;
    private int wiek;
    private String rasa;

    public Pies(String imie, int wiek, String rasa) {
        this.imie = imie;
        this.wiek = wiek;
        this.rasa = rasa;
    }

    @Override
    public String dajGlos() {
        return "hauhau";
    }
}

