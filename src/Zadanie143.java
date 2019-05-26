import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* ZADANIE #143*
Utwórz metodę, która przyjmuje napis (typ `String`) zawierający tylko liczby.
Metoda ma zwrócić mapę gdzie kluczem będzie liczba, a wartością ilość jej wystąpień.
*/
public class Zadanie143 {
    public static void main(String[] args) {
        System.out.println(iloscWystapien("1355583"));
        System.out.println(iloscWystapien2("13355583"));
    }
    static Map<String, Integer> iloscWystapien (String liczba) {
        List<String> cyfry = Arrays.asList(liczba.split(""));
        Map<String, Integer> output = new HashMap<>();
        for (int i = 0; i < cyfry.size(); i++) {
            String value = cyfry.get(i);
            if (output.containsKey(cyfry.get(i))) {
                int counter = output.get(value);
                counter++;
                output.put(value, counter);

            } else {
                output.put(cyfry.get(i), 1);
            }
        }
        return output;
    }
       static Map<String, Integer> iloscWystapien2 (String liczba) {
           List<String> cyfry = Arrays.asList(liczba.split(""));
           Map<String, Integer> output = new HashMap<>();
           for (int i = 0; i < cyfry.size(); i++) {
               output.put(
                       cyfry.get(i),
                       output.getOrDefault(cyfry.get(i), 0)+1
               );
           }
           return output;
       }
}
