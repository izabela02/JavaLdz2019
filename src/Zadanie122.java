import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*ZADANIE #122*
 Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania `-1`
 a następnie zwraca ich listę (np. wykorzystując implementację `ArrayList`)
*/
public class Zadanie122 {
    public static void main(String[] args) {
        List<Integer> integerList = listofNumber();
        System.out.println(integerList);
        List<Integer> integerList1=listofNum2();

    }

    static List<Integer> listofNumber() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        System.out.print("podaj liczbę :");
        for (; ; ) { // bez warunku, nieskończona pętla for

            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numList.add(num);
        }
        return numList;

    }

    static List<Integer> listofNum2() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        Integer num = null;
        do {
            numList.add(num);
            System.out.print("podaj liczbę :");
            num = scanner.nextInt();


        } while (num != -1);
        return numList;
    }
}
