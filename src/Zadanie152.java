/* *ZADANIE #152*
Utwórz metodę która przyjmuje niepustą liste lub tablicę a następnie w nieskończonej pętli je wyświetla (zaczynając od pozycji `0`).
Pętla ma zostać przerwana po wyjściu poza zakres listy (tzn. po przekroczeniu jej rozmiaru).
 */



import java.util.Arrays;
import java.util.List;

public class Zadanie152 {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(3,6,5,12,4,90);
        printArray(test);


    }

    static void printArray(List<Integer> list) {

        try {
            for (int i = 0; ; i++) {
                System.out.println(list.get(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
        }
    }
}
