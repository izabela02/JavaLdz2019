package Day_8;
/*ZADANIE #105*
 Utwórz metodę, która będzie wczytywała liczby
 od użytkownika do momentu podania liczby ujemnej a następnie wyświetli sumę oraz średnią wszystkich podanych liczb
 (bez uwzględniania tej ujemnej).
 */

import java.util.Scanner;

public class Zadanie105 {
    public static void main(String[] args) {
        sumAndAvg();

    }
    public static void sumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int counter = 0;

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
            counter++; // zwiększam licznik wprowadzanych liczb o 1 żeby wyliczyć średnią

        }
        double avg = counter == 0 ? 0.0 : (double) sum / counter;
        System.out.println("Suma: " + sum + " Srednia: " + avg);
    }
}
