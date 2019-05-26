package Zadanie130;
/*Utwórz klasę `GeneratorLiczbPierwszych` oraz zaimplementuj metody:
>* umożliwiającą wygenerowanie wybranej ilości liczb pierwszych. Dla `4` powinno zwrócić
tablicę zawierającą `[2, 3, 5, 7]`, a dla `10` powinno zwrócić tablicę zawierającą `[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]`.
>* zwrócenie wybranej liczby pierwszej
>* spradzają czy liczba podana jako parametr jest pierwsza (powinna zwracać wartość `boolean`)
 */

import java.util.Arrays;

public class GeneratorLiczbPierwszych {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generator(1000)));

}


    static int[] generator(int liczba) {
        int[] arr = new int[liczba];
        int counter = 0;

        for (int i = 2; counter < liczba; i++) {

            if (czyPierwsza(i)) {
                arr[counter] = i;
                counter++;
            }
        }
        return arr;
    }

    static boolean czyPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }

        for (int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}
