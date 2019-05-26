import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*ZADANIE #136*
 Utwórz metodę, która przyjmuje listę liczb a następnie analizuje je parami.

 Jeśli w danej parze, *lewa liczba jest większa* od prawej, to para musi znaleźć się w liście wynikowej ale w odwrotnej kolejności.

 Jeśli *prawa liczba jest większa* - parę należy zastąpić sumą liczb (w tej parze)
 */
public class Zadanie136 {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 2, 3, 4, 5, 5);
        System.out.println(analizator(test));

    }

    static List<Integer> analizator(List<Integer> list) {
        if (list == null)
            return null;

        List<Integer> out = new ArrayList();

        for (int i = 1; i < list.size(); i += 2) {
            Integer prawa = list.get(i);
            Integer lewa = list.get(i - 1);

            if (lewa > prawa) {
                out.add(prawa);
                out.add(lewa);
            } else {
                out.add(lewa + prawa);
            }
        }

        if (list.size() % 2 == 1) {
            out.add(list.get(list.size()-1));
        }
            return out;
    }
}
