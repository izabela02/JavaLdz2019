/*ZADANIE #116*
 Utwórz klasę `Ksztalt` oraz klasy dziedziczące po niej:
 - klasę `Prostokat` (z polami `dlugosc`, `szerokosc`),
 - klasę `Koło` (z polem `promien`).
 - klasę `Kwadrat` (z polem `Prostokat`).

 Zablokuj możliwość tworzenia obiektów klasy `Ksztalt` oraz wymuś, by klasy dziedziczące musiały zaimplementować metodę `wyswietlInformacjeOSobie()`.
 */

package Zadanie116;

public class Main {
    public static void main(String[] args) {

            Kolo kolo = new Kolo(2.0);
            Prostokat prostokat = new Prostokat(4.0, 2.0);
            Trojkat trojkat = new Trojkat(6);

            System.out.println(kolo.wyswietlInfo());

        }
    }