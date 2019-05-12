/*
 Utwórz metodę, która zwraca tablicę o podanym rozmiarze wypełnioną kolejnymi wartościami zaczynając od `10`:
 > Dla `4` zwróci: `[10, 11, 12, 13]`
 >
 > Dla `8` zwróci: `[10, 11, 12, 13, 14, 15, 16, 17]
 */

import java.util.Arrays;

public class zadanie49 {
    public static void main(String[] args) {
        int [] ints = array(5);
        System.out.println(Arrays.toString(ints));
        showArray(ints);

    }

    static int[] array(int size) {
        int[] newArray = new int[size]; // nowa zmienna, przypisano jej tablicę danego rozmiaru
        for (int index = 0; index < size; index++) {
            newArray[index] = 10 + index;
        }
        return newArray;
    }

    static void showArray(int[] array) {
        for (int number = 0; number < array.length; number++) {
            System.out.print(array[number] + ", ");
        }

        }
    }

