package Day_8;
/*ZADANIE #104*
 Utwórz metodę, która wczyta od użytkownika *dwie* liczby a następnie zwróci ich sumę. Wykorzytaj klasę `Scanner`
 */

import java.util.Scanner;

public class Zadanie104 {
    public static void main(String[] args) {
        sum();

    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in); // system.in oznacza skąd ma czytać wartość (w tym wypadku konsola)
        System.out.println("Podaj pierwszą liczbę : ");
        int num1 = scanner.nextInt(); // zwraca liczby w konkretnym typie (Int)
        System.out.println("Podaj drugą liczbę : ");
        int num2 = scanner.nextInt();

        System.out.println("Suma obydwóch liczb = " + (num1 + num2));
    }
}
