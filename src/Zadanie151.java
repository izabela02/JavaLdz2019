import java.util.InputMismatchException;
import java.util.Scanner;

/*
*ZADANIE #151*
Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania wartości `-1` i *zwraca* ich sumę.
* W przypadku podania złej wartości (np. `aaa`) metoda ma NIE przerywać odczytywania tylko wyświetlić komunikat
 */
public class Zadanie151 {
    public static void main(String[] args) {
        System.out.println(sum());

    }

    static int sum() {
        Scanner scan = new Scanner(System.in);
        int add = 0;
        for (; ; ) {
            try {
                int num = scan.nextInt();
                if (num == -1) {
                break;
            } else {
                    add += num;
                }
            } catch (InputMismatchException exeption) { // nie wywala programu, wyświetla komunikat jeśli podam wartość -1
                System.out.println("Podaj liczbę całkowitą");
                scan.nextLine(); // musimy wyczyścić skaner po wyświetleniu komunikatu, dlatego tu stosujemy tę metodę
                exeption.printStackTrace(); // wyświetla mi jaki jest błąd, nie wywala z programu

            }

        }
        return add;
    }

    }
