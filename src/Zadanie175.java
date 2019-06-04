/*
*ZADANIE #175*
Utwórz metodę która przyjmuje *dwie* daty (w postaci `2018-04-07`) oraz zwraca liczbę dni różnicy pomiędzy nimi.
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Zadanie175 {
    public static void main(String[] args) {
        System.out.println(twoDate("2018-04-07", "2019-04-07"));


    }
    static int twoDate (String data1, String data2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(data1, formatter);
        LocalDate localDate1 = LocalDate.parse(data2, formatter);
        // Klasa Period wykorzystywana jest do liczenia dni, natomiast Duration do czasu (trwanie)
        Period period = Period.between(localDate, localDate1);
        return (int)ChronoUnit.DAYS.between(localDate,localDate1); // zwraca liczbę dni różnicy


    }
}
