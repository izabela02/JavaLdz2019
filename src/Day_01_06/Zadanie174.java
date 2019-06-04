package Day_01_06;
/*
*ZADANIE #174*
Utwórz metodę która przyjmuje jako parametr datę
* (w formie Stringa) w postaci `24-03-2017` lub `24.03.2017` oraz ma zwrócić informację który to jest dzień roku.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zadanie174 {
    public static void main(String[] args) {
        System.out.println(dataFormat("02-06-2019"));

    }

    static int dataFormat (String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd.MM.yyyy]");
        LocalDate localDate = LocalDate.parse(data, formatter);
        return localDate.getDayOfYear();


    }

}
