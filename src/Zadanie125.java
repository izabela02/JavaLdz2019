/*ZADANIE #125*
 Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca listę, która będzie zawierała dwie listy.
 Na pozycji `0` mają być elementy (wartości) parzyste, a na pozycji `1` elementy nieparzyste.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie125 {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1,5,6,9,4,2,4,68,874,-124,123);
        System.out.println(evenAndOddList(test));

    }

    static List<List<Integer>> evenAndOddList(List<Integer> inputList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (Integer integer : inputList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            } else {
                oddList.add(integer);
            }
        }
        return Arrays.asList(evenList,oddList);
    }
}
