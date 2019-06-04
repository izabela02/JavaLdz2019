package Day_01_06.Zadanie166;
/* *ZADANIE #166*
Utwórz klasę `Telefon` (z polami `nazwa`, `model`,  `marka`, `numer`) oraz zaimplementuj w niej meotdę `equals()` i `hashCode()`

 */
public class Telefon {
    private String nazwa;
    private String model;
    private String marka;
    private String numer;

    public Telefon(String nazwa, String model, String marka, String numer) {
        this.nazwa = nazwa;
        this.model = model;
        this.marka = marka;
        this.numer = numer;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "nazwa='" + nazwa + '\'' +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", numer='" + numer + '\'' +
                '}';
    }

}
