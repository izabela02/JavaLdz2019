/*Utwórz metodę, która jako parametr przyjmuje tablicę
i *zwraca nową tablicę* z liczbami w odwrotnej kolejności.
 */

import java.util.Arrays;

public class zadanie51 {
    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 3, 4,};

        // System.out.println(Arrays.toString(odwroc(sampleArray)));
        System.out.println(Arrays.toString(sampleArray));

        System.out.println(Arrays.toString(odwroc2(sampleArray)));


    }

    static int[] odwroc(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = array.length - 1 - i;
            newArray[newIndex] = array[i];

        }
        return newArray;
    }

    static int[] odwroc2(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            // operacja nr 1
            int temp = array[i];
            // operacja nr 2
            int newIndex = array.length - 1 - i;
            array[i] = array[newIndex];
            // operacja nr 3
            array[newIndex] = temp;
        }
        return array;
    }
}
