package Day_01_06.Zadanie170;
/*
*ZADANIE #170 - blok inicjalizacyjny*
Utwórz klasę `Zwierze` oraz klasę (po niej dziedziczącą) `Pies`.
* Przetestuj działanie bloków inicjalizacyjnych.
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //  Zwierze z1 = new Zwierze();

//        Pies p1 = new Pies();
//        System.out.println();
//
        //    Pies p2 = new Pies();
//        System.out.println(Pies.imie);
//        System.out.println();
//        Pies p3 = new Pies();
//        System.out.println(Pies.imie);

        Map<Integer, String> mapa = new HashMap<Integer, String>() {

            {
                put(1,"Ala");
                put(2, "Adam");
                put(3, "Pies");
            }
        };
        System.out.println(mapa);
    }
}