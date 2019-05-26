/*ZADANIE #138*
Utwórz metodę, która przyjmuje listę liczb a następnie pierwiastkuje każdą z liczb a do wyniku dodaje `10`.

Na liście wynikowej ma nie być liczb, które *kończą się* na `5` lub `6`.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie138 {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 3, 8, 4, -1, 9, 0, 125, 325, 36);
        System.out.println(sqareEveryElement(test));
    }

    static List<Integer> sqareEveryElement(List<Integer> list) {
        List<Integer> outputList = new ArrayList<>();

        if (list == null) {
            return null;
        }
        for (Integer integer : list) {
            if (integer == null || integer < 0) {
                continue;
            }
            int tempValue = (int) Math.round(Math.sqrt(integer)) + 10;
            int checkValue = tempValue % 10;
            if (checkValue == 5 || checkValue == 6) {
                continue;
            }
            outputList.add(tempValue);


        }
        return outputList;

    }
}
