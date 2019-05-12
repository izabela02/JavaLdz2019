/*Utwórz metodę, która przyjmuje 3 parametry. Pierwsze dwa to krańce przedziału.
Trzeci to “skok” pomiędzy liczbami. Gdy przekazany przedział będzie błędny, metoda ma wyświetlić komunikat.
> Dla `1, 10, 3` wyświetli `1, 4, 7, 10`
 */

public class Zadanie30 {
    public static void main(String[] args) {
        zakres(300,2,5);
        zakres(1,10,3);

    }
    static void zakres (int start, int end, int jump) {
        if (start > end) {
            System.out.println("NIE!");
        }
        for (int i = start; i <= end; i += jump) {
            System.out.print(i+", ");
        }

    }
}

