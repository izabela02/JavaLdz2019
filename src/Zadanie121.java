/*ZADANIE #121*
 Utwórz metodę, która przyjmuje liczbę elementów do wylosowania a następnie zwraca listę (np. `ArrayList`) wypełnioną losowymi wartościami.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadanie121 {
    public static void main(String[] args) {
        System.out.println(randomList(-5)); // zwraca nam pustą listę, ponieważ nie wchodzi w pętlę
        System.out.println(randomList(5));
        System.out.println(randomList(10));
        System.out.println(randomList(0)); // zwraca nam pustą listę

    }
    static List<Integer> randomList (int num) {
        List <Integer> result = new ArrayList<>();
        Random r = new Random ();
        for (int i = 0; i < num; i++) {
            result.add(r.nextInt(100));
        }
        return result;
    }
}

