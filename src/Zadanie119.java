import java.util.Arrays;
import java.util.List;

/*ZADANIE #119*
 Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca różnicę pomiędzy największa a najmniejszą.
*/
public class Zadanie119 {
    public static void main(String[] args) {
        List<Integer> tescik = Arrays.asList(2, 6, 4, null, 32, -10);
        System.out.println(roznicaMaxMin(tescik));
    }

    static int roznicaMaxMin(List<Integer> list) {
        int max = list.get(0);
        int min = list.get(0);

        for (Integer integer : list) {
            if (integer == null) continue;
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }
        return max - min;

    }
}

