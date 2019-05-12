/*Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę. Metoda ma usunąć wszystkie elementy równe
podanemu parametrowi (tzn. gdy podamy `2` to ma usunąć z tablicy wszystkie `2`-jki)
> Dla `([1, 2, 2, 4, 5],  2)`
> zwróci `[1, 4, 5]`
*/


import java.util.Arrays;

    public class zadanie56 {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4,5};
        System.out.println(Arrays.toString(modifiedArray(arr, 2)));
    }

    static int[] modifiedArray(int[] array, int valDelete) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valDelete) {
                counter++;
            }
        }
        if(counter == 0){
            return array;
        }
        int [] newArray = new int [array.length-counter];
        int newCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != valDelete){
                newArray[newCounter] = array[i];
                newCounter++;
            }
        }
        return newArray;
    }
}






