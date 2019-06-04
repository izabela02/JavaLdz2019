package Day_01_06.Zadanie167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dziecko pierworodny = new Dziecko("Brajanek", 2, "Nowak");
        Dziecko drugie =  new Dziecko ("Szymon",3, "Bobo");
        Dziecko trzecie = new Dziecko("Szymon", 3, "Nowak");
        Dziecko czwarte = new Dziecko ("Iza", 5,"Dzidzi");
        Dziecko kolega = new Dziecko ("Kamil", 5, "Ress");
        Dziecko kolezanka = new Dziecko ("Bartek",5, "Zbroj");
        Dziecko piąte =  new Dziecko ("Kasia", 1, "Wiem");

        List<Dziecko> dzieci = Arrays.asList(pierworodny, drugie, trzecie, czwarte, kolega, kolezanka, piąte);
        System.out.println(dzieci);
        Collections.sort(dzieci); // zamienia już istniejacą listę
        System.out.println(dzieci);
        System.out.println(drugie.compareTo(piąte));
    }
}
