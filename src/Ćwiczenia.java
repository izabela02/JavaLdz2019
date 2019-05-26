/*Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
/*Utwórz metodę, która jako parametr przyjmuje tablicę
i *zwraca nową tablicę* z liczbami w odwrotnej kolejności.
 */

import java.util.Arrays;

public class Ćwiczenia {
    public static void main(String[] args) {
        int [] simpleArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(simpleArray));
        System.out.println(Arrays.toString(odwróć(simpleArray)));


    }

    static int[] odwróć(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = array.length - 1 - i;
            newArray[newIndex] = array[i];

        }
        return newArray;
    }
}



