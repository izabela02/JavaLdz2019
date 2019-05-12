/*ZADANIE #53*
 Utwórz metodę, która przyjmuje trzy parametry - tablicę oraz dwie liczby.
 Metoda ma zwrócić nową tablicę do której na wybranej pozycji (podanej jako drugi parametr)
 wstawi nowy element (podany jako trzeci parametr).
 > Dla `([1, 2, 3, 4, 5], 2, 77)`
 > powinno zwrócić `[1, 2, 77, 3, 4, 5]`
*/

import java.util.Arrays;

public class zadanie53 {
    public static void main(String[] args) {
        int[] arr = {7, -5, 9, 12, 17};
        System.out.println(Arrays.toString(changedArr(arr, 3, 111)));
        System.out.println(Arrays.toString(changedArr(arr, 0, 111)));
        System.out.println(Arrays.toString(changedArr(arr, 4, 111)));
        System.out.println(Arrays.toString(changedArr(arr, 8, 111)));

    }


    static int[] changedArr(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        int newIndex = Math.min(index, array.length);
        for (int i = 0; i < newIndex; i++) {
            newArray[i] = array[i];

        }
        if (array.length >= index) {
            newArray[index] = value;
        } else {
            newArray[newIndex] = value; // newArray(newArray.length -1] = value;
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i + 1] = array[i];

        }

        return newArray;
    }
}
