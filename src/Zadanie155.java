import java.util.Scanner;

/*
*ZADANIE #155*
Utwórz metodę, która przyjmuje dwa parametry - napis (`String`) oraz liczbę (`int`) wcześniej odczytaną `Scanner`-em od użytkownika.
* Metoda ma wyświetlić podany napis, przekazaną liczbę razy.
* W przypadku gdy liczba wystąpień będzie mniejsza bądź równa zero powinien zostać rzucony własny wyjątek (dziedziczący po `RuntimeException`).
*/
public class Zadanie155 {
    public static void main(String[] args) {
        printTimes(inputString(), inputNumber());


    }
    private static String inputString() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
    private static int inputNumber() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }

    private static void printTimes(String s, int times) {
        if (times <= 0) {
            throw new BadParametersException();
        }
        for (int i=0; i < times; i++) {
            System.out.println(s);
        }
    }
}

class BadParametersException extends RuntimeException {
    public BadParametersException() {
        super("no co Ty wgl");
    }

}