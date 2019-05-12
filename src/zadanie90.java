/*
Utwórz metodę, która wykorzystuje mechanizm
*varargs* by przekazać do metody dowolną, większą od zera, liczbę
elementów typu `int` i zwrócić ich sumę.

 */


public class zadanie90 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 8, 10));

        int[] arrayOne = {1, 2, 3, 4, 8, 10};
        System.out.println(sum(1, arrayOne));

        System.out.println(sum(1));
    }

    static int sum(int min, int... tab) { // odwołuję się do tab tak samo jak do tablicy
        int summarize = 0;
        for (int i = 0; i < tab.length; i++) {
            summarize += tab[i];
        }
        return summarize;

    }
}
