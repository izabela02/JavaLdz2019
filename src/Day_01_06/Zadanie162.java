package Day_01_06;
/*
*ZADANIE #162 - REKURENCJA*
Utwórz metodę, która przyjmie parametr określający liczbę wyświetleń napisu  `"Hello World"`.
* Napis wyświetl przy użyciu *REUKRENCJI*
 */

public class Zadanie162 {
    public static void main(String[] args) {
        repeatWord(5);

    }
    static void repeatWord (int number) {
        if (number > 0) {
            System.out.println("HelloWorld");
            repeatWord(--number);
        }

    }

}
