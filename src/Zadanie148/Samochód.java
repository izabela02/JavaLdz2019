package Zadanie148;
/*ZADANIE #148*
 Utwórz klasę Samochod (zawierająca pola `nazwa`, `kolor` oraz *unikalny* `nrRejestracji`),
 następnie dodaj kilka obiektów do mapy (gdzie kluczem będzie `identyfikator` a wartością *obiekt* klasy `Samochód`).
*/

import java.util.ArrayList;
import java.util.List;

public class Samochód {
    private String nazwa;
    private Kolor kolor;
    private String nrRejestracji;

    private static List<String> rejestracje = new ArrayList<>();

    private Samochód(String nazwa, Kolor kolor, String nrRejestracji) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.nrRejestracji = nrRejestracji;

        rejestracje.add(nrRejestracji);
    }
     public static Samochód getInstance (String nazwa, Kolor kolor, String nrRejestracji) {
        if (rejestracje.contains(nrRejestracji)) {
            return null;
        } else {
            return new Samochód(nazwa, kolor, nrRejestracji);
        }

}

    @Override
    public String toString() {
        return "Samochód{" +
                "nazwa='" + nazwa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", nrRejestracji='" + nrRejestracji + '\'' +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;
    }

    public String getNrRejestracji() {
        return nrRejestracji;
    }

    public void setNrRejestracji(String nrRejestracji) {
        this.nrRejestracji = nrRejestracji;
    }
}