/*
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca *NAJWIĘKSZĄ* liczbę z tej tablicy
 */

public class zadanie48 {
    public static void main(String[] args) {
        int [] liczby = {1,2,3,4,5};
        int [] ujemne = {-1,-2,-3,-4,-5};
        int [] pusta = {};
        int [] pojedyncza = {1};

        System.out.println(biggest(liczby));
        System.out.println(biggest(ujemne));
        System.out.println(biggest(pusta));
        System.out.println(biggest(pojedyncza));
    }

    static int biggest(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int najwieksza = array [0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > najwieksza) {
                najwieksza = array[i];
            }

        }
        return najwieksza;
    }
}
