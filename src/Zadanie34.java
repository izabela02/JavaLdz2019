/*Utwórz metodę, do której przekazujesz trzy parametry (np `start`, `amount`, `jump`).
Następujące parametry odpowiadają za:
pierwszy - początkowa (pierwsza) wyświetlona wartość
drugi  - liczba wyświetlonych elementów
trzeci (double) - różnica pomiędzy kolejnymi elementami (“skok”)
> Dla `0, 5, 5` wyświetli `0, 5, 10, 15, 20` (zaczynamy od `0`, wyświetlamy `5` elementów a elementy różnią się od siebie o `5`)
>
> Dla `0, 6, 2.5` wyświetli `0.0, 2.5, 5.0, 7.5, 10.0, 12.5` (zaczynamy od `0`, wyświetlamy `6` elementów a elementy różnią się od siebie o `2.5`)*/

public class Zadanie34 {
    public static void main(String[] args) {
        parametr(0, 5, 5);
        parametr(0,6,2.5);

    }

    static void parametr(int start, int amount, double jump) {
        for (int i = 0; i < amount; i++) {
            System.out.print(start + i * jump + ", ");
        }
        System.out.println("\b");
    }
}