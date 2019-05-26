import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*ZADANIE #120*
 Utwórz metodę, która przyjmuje listę (`List`) np. `ArrayList` elementów typu `String` a następnie zwraca listę w odwróconej kolejności.
 */
public class Zadanie120 {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("Ala", "ma", "kota");
        System.out.println(array);
        System.out.println(getReversedList(array));
        System.out.println();
        System.out.println(getReversedListForEach(array));
        Collections.reverse(array);
        System.out.println(array);

    }

    static List<String> getReversedList(List<String> list) {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           // array.add(list.get(list.size() - i - 1));
            array.add(0, list.get(i));
        }
        return array;

    }
    static List<String> getReversedListForEach(List<String> list) {
        List<String> array = new ArrayList<>();
        for (String element : list) {
            array.add(0, element);
        }
        return array;

        }
}
