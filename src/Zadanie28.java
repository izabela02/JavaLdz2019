/*Utwórz metodę, w której pętlą wyświetlisz wszystkie liczby od `0` do wartości
podanej przez użytkownika (przekazywanej jako parametr do tej metody)
> gdyż użytkownik poda `3` wyświetl `0, 1, 2, 3`
>
> gdyż użytkownik poda `0` wyświetl `0`
>
> gdyż użytkownik poda `-3` wyświetl `-3, -2, -1, 0`
 */
public class Zadanie28 {
    public static void main(String[] args) {
        petla(3);
        petla(0);
        petla(-3);
    }

    static void petla(int liczba) {
        for (int i = liczba; i < 0; i++) { // ta pętla nie spełnia warunku, więc wyświetla się 0
            System.out.print(i + ", ");

        }
        System.out.print(0 + ", ");


        for (int i = 1; i <= liczba; i++) {
            System.out.print(i + ", ");

        }
        System.out.println("\b\b");
    }
}




