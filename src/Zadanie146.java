/*ZADANIE #146 - PRACA DOMOWA*
 Utwórz metodę, która przyjmuje jeden parametr - mapę w postaci `String : List<Integer>`. Metoda ma zwrócić napis. W mapie przekazanej jako parametr,
 kluczami są litery a jako wartościami - *pozycje* na jakich mają wystąpić w zwracanym napisie.

 */

import java.util.List;
import java.util.Map;

public class Zadanie146 {
    public static void main(String[] args) {

    }
    static String makeAWord(Map<String, List<Integer>> input) {


        int indexCounter = 0;
        for (Map.Entry<String, List<Integer>> arraySizeCount : input.entrySet()) {

            indexCounter += arraySizeCount.getValue().size();
        }

        String[] outputArray = new String[indexCounter];

        for (Map.Entry<String, List<Integer>> stringListEntry : input.entrySet()) {

            for (Integer index : stringListEntry.getValue()) {

                outputArray[index] = stringListEntry.getKey();
            }
        }

        return String.join("", outputArray);

    }
}