package Day_01_06;
/*
*ZADANIE #172*
Utwórz metodę która przyjmuje jako parametr godzinę
* (w formie Stringa) w postaci `13:22:18` (tj. `godzina-minuta-sekunda`) oraz zwróci tekst w postaci `Mamy 22 minuty po godzinie 13-tej`
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zadanie172 {
    public static void main(String[] args) {
        System.out.println(metoda("22:32:21"));
        System.out.println(metoda("13:22:05"));

    }

    private static String metoda(String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, formatter);

        int minutes = localTime.getMinute();
        int hour = localTime.getHour();

        return String.format("Mamy %s minuty po godzinie %s",
                minutes,
                hour);
    }

}

