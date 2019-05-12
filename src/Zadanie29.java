/*Utwórz metodę, która przyjmuje jeden parametr i *wyświetla* wszystkie potęgi dwójki nie przekraczające podanego parametru
> dla `20` wyświetli `1, 2, 4, 8, 16`
>
> dla `30` wyświetli `1, 2, 4, 8, 16`
>
> dla `80` wyświetli `1, 2, 4, 8, 16, 32, 64`

Zadanie zrealizuj z wykorzystaniem pętli
- `for`
- `while`
- `do-while` (edited)
 */

public class Zadanie29 {
    public static void main(String[] args) {
        potegi(20);
        potegi3(40);
        potęgi4(20);


    }

    static void potegi(int liczba) {
        for (int i = 0; i < liczba; i++) {
            double potęga = Math.pow(2, i);
            if (Math.pow(2, i) >= liczba) {
                break;
            }
            System.out.print(Math.pow(2, i) + ", ");
        }
        System.out.println("\b\b");
    }

    static void potegi3(int liczba) {
        int i = 1;
        while (i < liczba) {
            System.out.print(i + ", ");
            i *= 2;

        }
        System.out.println("\b\b");
    }

    static void potęgi4(int liczba) {
        int i = 1;
        do {
            System.out.println(i + ", ");
            i *= 2;
        } while (i < liczba);
        System.out.println("\b\b"); // poza pętlą

    }
           }













