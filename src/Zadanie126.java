import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Utwórz metodę, która przyjmuje dwa parametry - listę liczb (np. `ArrayList`) oraz indeks za którym należy “przeciąć” tablicę i zwrócić drugą część.
> Dla `3` oraz `<1, 7, 8, 22, 10, -2, 33>`
> powinno zwrócić `<10, -2, 33>`

 */
public class Zadanie126 {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(cutListAfter(test, 50));
        System.out.println(cutListAfter(test, 4));
    }

    static List<Integer> cutListAfter(List<Integer> inputList, int index) {
        List<Integer> outputList = new ArrayList<>();
        if (index > inputList.size() - 1) {
            System.out.println("Index większy niż rozmiar Listy");
            return null;
        }

        for (int i = index; i < inputList.size(); i++) {
            outputList.add(inputList.get(i));

        }
        return outputList;
    }
}
