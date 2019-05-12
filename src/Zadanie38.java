/*Utwórz metodę, do której przekazujesz liczbę, a ona *ZWRACA* informację czy liczba
jest PIERWSZA czy nie (tzn. podzielna przez 1 i samą siebie).
 */

public class Zadanie38 {
    public static void main(String[] args) {
        System.out.println(isFirst(8));
        System.out.println(isFirst(3));

    }

    static boolean isFirst(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}
