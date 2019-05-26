import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* ZADANIE #140*
 * Utwórz metodę, która która przyjmuje set (np. `HashSet`) i zwraca jego rozmiar (tzn. liczbę elementów)
 */
public class Zadanie140 {
    public static void main(String[] args) {
        Set<Integer> test = new HashSet<>(Arrays.asList(1,2,3,4,4));
        System.out.println(size(test));

    }

    static int size(Set<Integer> set) {
        return set.size();
    }
}
