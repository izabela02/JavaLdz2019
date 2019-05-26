/* ZADANIE #149*
Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania wartości `-1`
a następnie zwraca mapę wartości, gdzie kluczem jest liczba a wartością jest liczba jej wystąpień.
 */




import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Zadanie149 {
    public static void main(String[] args) {
        System.out.println(myMap());
    }
    static Map<Integer, Integer> myMap () { // tworzymy metodę myMap z pustą mapą, ponieważ nie mamy podanych wartości
        Scanner search = new Scanner(System.in); // używamy metodę scanner ponieważ wczytujemy liczby od użytkownika
        Map <Integer, Integer> finalMap = new HashMap<>();
        for(; ;) {
            int num = search.nextInt(); // odczytując liczbę z klawiatury wywołuję metodą nextInt Inta (jakaś wartość)
            if (num == -1) {
                break;
            } else {
                finalMap.put(num, finalMap.getOrDefault(num,0)+1); // bierzemy stara wartość i zwiększamy o 1, obliczamy w ten sposób liczbę
                                                                              // wystapień

            }

        }
        return finalMap;
}
}