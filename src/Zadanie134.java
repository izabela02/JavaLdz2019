import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*ZADANIE 134*
 Utwórz metodę która przyjmuje listę elementów a następnie zamienia wartości parami (dwójkami)
 ```A B C D E F G```
 zamieni na:
 ```B A D C F E G```

 */
public class Zadanie134 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
        System.out.println(pairSwap(list));

    }

    static List<String> pairSwap(List<String> list) {
        if (list == null) { // jeżeli jest nullem to zwracam nulla
            return null;
        }

        List<String> result = new ArrayList<>(); // chce zwrócić tablicę i wypełnić ją wartościami
        for (int i = 1; i < list.size(); i += 2) { // zaczynam od jedynki, ponieważ chce zacząć od pary
            result.add(list.get(i));
            result.add(list.get(i - 1));
        }
        if (list.size() % 2 == 1) { // jeżeli rozmiar listy jest nieparzysty
            result.add(list.get(list.size() - 1));

        }

        return result;

    }
}
