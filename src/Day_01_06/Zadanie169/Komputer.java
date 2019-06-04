package Day_01_06.Zadanie169;
/*
*ZADANIE #169*
Utwórz klasę `Komputer` z metodami `start()` i `prepare()`, które wyświetlają jakieś komunikaty tekstowe.
Metoda `start()` ma być wywoływana w konstruktorze.

Utwórz klasę `NowyKomputer()` która dziedziczy po klasie `Komputer()` i ma inne treści wyświetlanych metod.
 */

public class Komputer {

    public Komputer() {


        System.out.println("Start - komunikat tekstowy");
    }
     public void prepare() {
         System.out.println("Prepare - inny komunikat tekstowy");
    }
}
