/*ZADANIE33*
 Utwórz metodę, do której przekazujesz jeden parametr i zwraca sumę wszystkich elementów od `1` do podanej liczby
 > dla `3` zwróci `1 + 2 + 3 = 6`
 >
 > dla `5` zwróci `15` bo `1 + 2 + 3 + 4 + 5 = 15`
 >
 > dla `11` zwróci `66` bo `1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 = 66`
 */

public class Zadanie33 {
    public static void main(String[] args) {
        System.out.println(suma(3));
        System.out.println(suma(5));
        System.out.println(suma(11));

    }

    static int suma(int liczba) {
        int wynik = 0;
        for (int i = 1; i <= liczba; i++) {
            wynik += i;


        }
        return wynik;
    }

}
