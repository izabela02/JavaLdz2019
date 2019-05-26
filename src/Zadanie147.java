import java.util.*;

/*ZADANIE #147*
 Utwórz metodę, która przyjmuje jeden parametr - maksymalną liczbę. Metoda powinna zwrócić mapę, gdzie kluczami będą kolejne liczby od `1`
 do podanej liczby (jako parametr). Wartościami tej mapy będzie informacja, przez jakie liczby jest ona podzielna.
 ...
10 -> 1, 2, 5, 10
11 -> 1, 11
12 -> 1, 2, 3, 4, 6, 12
13 -> 1, 13
14 -> 1, 2, 7, 14
...
*/
public class Zadanie147 {
    public static void main(String[] args) {
        System.out.println(dividersList(18));


    }

    static Map<Integer, Set<Integer>> dividersList(int max) { // max - nasz parametr Integer
        Map<Integer, Set<Integer>> resultMap = new TreeMap<>(); // implementacja nowej mapy, jako klucze ma Integery, jako wartosci sety integerów
        for (int i = 1; i < max; i++) {
            resultMap.put(i, getDividers(i)); // i jest kluczem, jako wartość przypisujemy jej dzielniki metodą get dividers

        }
        return resultMap;
    }

    private static Set<Integer> getDividers(int number) { // nowa metoda do wydzielenia dzielników, nie będą się powtarzać
        Set<Integer> resultSet = new TreeSet<>(); // implementacja interfejsu Set, TreeSet przy każddym dodawaniu sortuje klucze,
                                                 // w secie wartości nie mogę się powtarzać
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) { // warunek if sprawdza czy liczba jest podzielna przez i
                resultSet.add(i);

            }

        }
        resultSet.add(number);
        return resultSet;

    }

}
