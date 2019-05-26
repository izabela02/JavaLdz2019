/* ZADANIE #141*
Utwórz metodę, która przyjmuje dwa parametry - set (np. `HashSet`)
oraz poszukiwaną liczbę. Metoda ma zwrócić set elementów większych od podanego (drugiego) parametru.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zadanie141 {
    public static void main(String[] args) {
        Set<Integer> test = new HashSet<>(Arrays.asList(10,1,2,3,4,5,6,7,8,9));
        System.out.println(secik(test, 3));

    }
    static Set<Integer> secik (Set<Integer> input, int poszukiwanaLiczba) {
        Set<Integer> output = new HashSet<>();
        for (Integer integer : input) {
            if (integer > poszukiwanaLiczba) {
                output.add(integer);
            }
        }
        return output;
    }
}
