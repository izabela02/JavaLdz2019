package Day_01_06.Zadanie165;
/*
*ZADANIE #165*
Utwórz klasę `Samochod` (z polami `nrRejestracji` oraz `kolor`) oraz zaimplementuj w niej meotdę `equals()` i `hashcode()`
* która umożliwi porównanie obiektów ze sobą. Przetestuj działanie tej metody tworząc kilka obiektów i porównując je ze sobą.
 */

public class Samochód {
    private String nrRejestracji;
    private Kolor kolor;
    private double przebieg;

    public Samochód(String nrRejestracji, Kolor kolor) {
        this.nrRejestracji = nrRejestracji;
        this.kolor = kolor;
        this.przebieg = przebieg;

    }

    public String getNrRejestracji() {
        return nrRejestracji;
    }

    public Kolor getKolor() {
        return kolor;
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "nrRejestracji='" + nrRejestracji + '\'' +
                ", kolor=" + kolor +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { // porównuje się z niczym
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Samochód)) {
            return false;
        }
        Samochód samochód = (Samochód) obj;
        if (!samochód.nrRejestracji.equals(this.nrRejestracji)) {
            return false;
        }
        if (!samochód.kolor.equals(this.kolor)) {
            return false;
        }
        return true;
    }

   // @Override
    //public int hashCode() {
      //  int liczba = 7;
        //liczba += nrRejestracji.hashCode() * 31;
        //liczba += kolor.hashCode() * 31;

  //      return liczba;
  //  }


   // @Override
    //public int hashCode() {
      //  return new Random().nextInt();
    //}

    enum Kolor {
        BIAŁY, CZERWONY, ŻÓŁTY
    }
}