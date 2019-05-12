/*Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić tablicę z sumą kolumn podanych tablic. To znaczy element na pozycji `0` z pierwszej tablicy, dodajemy do elementu na pozycji `0` z drugiej tablicy.
*Przyjęte założenia:*
- Tablice są tych samych długości.
- Wartości na danej pozycji mogą być większę niż 10

 */

import java.util.Arrays;

public class zadanie58 {
    public static void main(String[] args) {
        int [] pierwsza = {9,2,3,8,};
        int [] druga = {9,9,7,0};
        int [] suma = sumakolumn(pierwsza, druga);
        System.out.println(Arrays.toString(suma));


    }

    static int[] sumakolumn(int[] firstArray, int[] secondArray) {
        int[] returnArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            returnArray[i] = firstArray[i] + secondArray[i];


        }
        return returnArray;
    }
}
