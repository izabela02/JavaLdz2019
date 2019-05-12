/*
Utwórz metodę, do której przekazujesz dwa parametry następnie wyświetlasz wszystkie liczby z podanego przedziału podzielne przez 3 i/lub 5
Dane wyświetl w formie:
> dla `0, 15` wyświetli:
>
 0  <-- 3, 5
 1
 2
 3  <-- 3
 4
 5  <-- 5
 6
 7
 9  <-- 3
10  <-- 5
11
12  <-- 3
13
14
15  <-- 3, 5```
 */

public class Zadanie35 {
    public static void main(String[] args) {
        showNumber(0,15);

    }

    static void showNumber(int liczba, int liczba2) {

        for (int i = liczba; i <= liczba2; i++) { // najpierw

            System.out.print(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("\t<-- 3, 5");
            } else if (i % 5  == 0){
                System.out.print("\t<-- 5");
            } else if (i % 3 == 0) {
                System.out.print("\t<-- 3");
            }
            System.out.println();
        }
    }
}
