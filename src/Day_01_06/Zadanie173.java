package Day_01_06;
/*
*ZADANIE #173*
Utwórz metodę która przyjmuje jako parametr datę (w formie Stringa)
* w postaci `2017-03-24` (tj. `rok-miesiac-dzień`) oraz zwróć datę (w formie Stringa) w postaci `24.03.2017` (tj. `dzień.miesiąc.rok`)
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zadanie173 {
    public static void main(String[] args) {
        System.out.println(dataFormat("2017-03-24"));

    }
    private static String dataFormat (String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // określamy format danych wejściowych
        LocalDate localDate = LocalDate.parse(data, formatter);
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // określamy format danych wyjściowych
        return localDate.format(formatterOut);

    }
}
