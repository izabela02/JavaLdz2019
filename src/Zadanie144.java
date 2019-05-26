import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
*ZADANIE #144*
Utwórz metodę, która przyjmuje trzy parametry. Pierwszy - liczba liczb do wylosowania, druga to początek zakresu losowania,
* trzecia to koniec zakresu losowania. Metoda ma zwrócić mapę gdzie kluczem jest liczba a wartością jest liczba jej wystąpień.
 */
public class Zadanie144 {
    public static void main(String[] args) {
        printMap(randomNums(100000,7,15));

    }
    static Map<Integer,Integer> randomNums (int quantity, int start, int stop) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <quantity; i++) {
            int randomInt = random.nextInt(stop-start+1)+start;
            map.put(randomInt, map.getOrDefault(randomInt,0) +1);
        }
        return map;
    }
    static void printMap(Map<Integer, Integer>map) {
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + "-->" + element.getValue());

        }
        }
    }


