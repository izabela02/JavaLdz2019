/*

Utwórz metodę, która przyjmuje conajmniej DWA parametry - boolean oraz dowolną ilość (większą od 0)
liczb (typu `int`).
Gdy pierwszy parametr ma wartość `true` metoda zwraca największą przekazaną liczbą, a gdy `false` najmniejszą.

 */

public class zadanie92 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,100};
        System.out.println(liczba(true,15, array));
        System.out.println(liczba(false, 1, array));

    }

    static int liczba(boolean czyNajwieksza, int start, int... ileLiczb) {
        int temp = start;
        if (czyNajwieksza) {
            for (int i = 0; i < ileLiczb.length; i++)
                if (ileLiczb[i] > temp) {
                    temp = ileLiczb[i];
                }

                } else{
                for (int i = 0; i < ileLiczb.length; i++) {
                    if (ileLiczb[i] < temp) {
                        temp = ileLiczb[i];
                    }
                }

            }
        return temp;


        }
    }

