/*ZADANIE #114*
 Utwórz klase `Produkt` (z metodą `wyswietlInformacje()`) a następnie dziedziczące z niej klasy `Ksiazka`, `Dlugopis` i `Plecak`.

 Nadpisz metodę `wyswietlInformacje()` w każdej z nich, a następnie utwórz 3 obiekty przypisując je do klasy `Produkt` (tzn. `Produkt p = new Dlugopis("")`).

 Dodaj obiekty do tablicy a następnie w pętli wywołaj w/w metodę dla każdego z obiektów.
 */


package Zadanie114;

public  abstract class Produkt {
    // abstract String pole; nie ma pól abstrakcyjnych

     abstract void wyswietlInformacje();

    }

