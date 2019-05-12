/*Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca drugą największą liczbę w tablicy.

 */

public class zadanie52 {
    public static void main(String[] args) {

        int[] testArray = {100, 100, 38, 44, 69, 65}; // jeżeli początkowa jest największa to zmieniamy w zmiennej
        System.out.println(secondBiggestValue(testArray));

    }

    static int secondBiggestValue(int[] array) { // daną wyjściową jest tablica
        int tempMaxValue = Integer.MIN_VALUE; // przypisujemy wartość minimalną
        int secondBiggest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > tempMaxValue) {
                tempMaxValue = array[i];
                System.out.println("Pierwsza = " + tempMaxValue);
                System.out.println("Druga = " + secondBiggest);
                System.out.println();
            } else if (array[i] > secondBiggest && array[i] != tempMaxValue) {
                secondBiggest = array[i];
                System.out.println("Pierwsza = " + tempMaxValue);
                System.out.println("Druga = " + secondBiggest);
                System.out.println();



            }

        }
        return secondBiggest;
    }
}
