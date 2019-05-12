/*Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
Metoda ma zwrócić pierwszy indeks szukanego elementu.
dy dana liczba nie będzie znajdować się w tablicy, metoda powinna zwrócić wartość `-1`. (edited)
 */
public class zadanie50 {
    public static void main(String[] args) {
        int [] wiek = {18,20,66};
        System.out.println(index(wiek, 20));
        System.out.println(index(wiek, 66));
        System.out.println(index(wiek, 80));

    }

    static int index(int[] array, int number) {
        for (int i = 0; i < array.length; i++) { // pętla zwiększa tylko licznik
            if (array[i] == number) {
                return i;

            }

        }
        return  -1;
    }
}