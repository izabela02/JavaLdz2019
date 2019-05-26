import java.util.*;

/*ZADANIE #145*
 Utwórz metodę, która przyjmuje jeden parametr - napis (typu `String`). Metoda ma zwrócić mapę w postaci `String : List<Integer>`,
 w której jako klucze mają być litery (z napisu wejściowego) a jako wartości - *pozycje* na jakich występują one w napisie wejściowym.
*/
public class Zadanie145 {
    public static void main(String[] args) {

    }

    static Map<String, List<Integer>> getLettersPositions(String s) {
        Map<String, List<Integer>> positions = new HashMap<>();
        List<String> letters = Arrays.asList(s.toLowerCase().split(""));

        int index = 0;
        for (String letter : letters) {
            List<Integer>list;
            if(positions.containsKey(letter)) {
                list = positions.get(letter);


            } else {
                list = new ArrayList<>();

            }
            list.add(index);
            positions.put(letter, list);
            index++;


        }
        return positions;

    }
}
