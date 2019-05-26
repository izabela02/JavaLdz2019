/*ZADANIE #118*
Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca ich sumę.
 */

import java.util.ArrayList;
import java.util.List;

public class Zadanie118 {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(2);
        test.add(12);
        test.add(-2);
        test.add(2, 10);
        System.out.println(sumOfList(test));
        System.out.println(sum2(test));

    }

    static int sumOfList(List<Integer> list) {
        int output = 0;
        for (int i = 0; i < list.size(); i++) {
            output += list.get(i);
        }
        return output;

    }

    static int sum2(List<Integer> list) {
        int output = 0;
        for (Integer num : list)
            output += num;

        return output;
    }
}
