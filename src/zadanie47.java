/* Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
Metoda ma zwrócić informację (jako wartość logiczna)
czy dana liczba znajduje się w tablicy.
 */

public class zadanie47 {
    public static void main(String[] args) {
        int[] numbers = {3,7,4,12,9};
        System.out.println(findNumber(numbers, 9));
        System.out.println(findNumber2(numbers, 21));




    }

    static boolean findNumber(int[] array, int num) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                result = true;
            }

        }
        return result;

    }

    static boolean findNumber2(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }

        }

        return false;
    }
}

