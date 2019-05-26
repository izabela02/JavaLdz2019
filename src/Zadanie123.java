import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*ZADANIE #123*
Utwórz metodę, która przyjmuje dwa parametry - listę liczb *całkowityh* (np. `ArrayList`) oraz poszukiwaną liczbę.
Metoda ma zwrócić listę indeksów pod którymi występuje poszukiwana liczba.
>
```10,  110,   2,  10,  1,  5,  8,  -11,  10,  3
XX              XX                     XX```
 */
public class Zadanie123 {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 10, 8, -1, 2, null, 5, 10, 12, 15);
        System.out.println(onWhichIndex(test, 10));

    }

    static List<Integer> onWhichIndex(List<Integer> inputList, Integer value) {
        int counter = 0;
        List<Integer> outputList = new ArrayList<>();
        for (Integer integer : inputList) {
            if (integer == value) {
                outputList.add(counter);
            }
            counter++;
        }
        return outputList;
    }

}
