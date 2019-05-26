import java.util.Arrays;
import java.util.List;

/*
*ZADANIE #137*
Utwórz metodę, która przyjmuje listę wyrazów (obiekty klasy `String`) a następnie zwraca je w formie zdania (zaczynając z dużej liter i wstawiając kropkę na końcu).

Jeśli w liście wejściowej będzie znajdował się przecinek, to nie możne nastąpić sytuacja że będzie miał on spacje po obydwóch stronach.
ŹLE:  `Jestem ciekawa , co dzisiaj się wydarzy
DOBRZE: `Jestem ciekawa, co dzisiaj się wydarzy`

 */
public class Zadanie137 {
    private static final String SPACJA = " ";
    private static final String KROPKA = ".";
    private static final String PRZECINEK = ",";
    private static final String NEWLINE = "\n";

    public static void main(String[] args) {
        List<String> test =
                Arrays.asList("ala", "ma", "bardzo", ",", "dużego", "kota","\n","a");
        System.out.println(zwrocZdanie(test));
    }

    static String zwrocZdanie(List<String> list) {
        StringBuilder sb = new StringBuilder();

        String pierwszyWyraz = list.get(0);
        pierwszyWyraz = pierwszyWyraz.substring(0, 1).toUpperCase() +
                pierwszyWyraz.substring(1).toLowerCase();

        sb.append(pierwszyWyraz);

        for (int i = 1; i < list.size(); i++) {
            switch (list.get(i)) {
                case PRZECINEK:
                    sb.append(PRZECINEK);
                    break;
                case NEWLINE:
                    break;
                default:
                    sb.append(SPACJA).append(list.get(i));
            }
        }
        return sb.append(KROPKA).toString();
    }
}