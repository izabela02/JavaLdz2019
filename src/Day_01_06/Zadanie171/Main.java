package Day_01_06.Zadanie171;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
         // method4();
       // method5();
       // method6();
       // method7();
        method8();

    }

    private static void method1() {
        LocalDate localDate = LocalDate.of(2019, Month.JUNE, 2);
        System.out.println("Moja data to: " + localDate);
        System.out.println("To " + localDate.getDayOfYear() + " dzień roku " + localDate.getYear());
        System.out.println("Następnego dnia będzie " + localDate.plusDays(100));
    }

    private static void method2() {
        LocalTime localTime = LocalTime.of(14, 30, 1, 23);
        System.out.println("Mój czas to: " + localTime);
        System.out.println("To godzina: " + localTime.getHour());

    }

    private static void method3() {
        LocalDateTime localDateTime = LocalDateTime.of(2012, 1, 1, 12, 32);
        System.out.println("Moja datogodzina to: " + localDateTime);
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Obecny czas to " + now);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("Obecny czas to: " + now2);
        System.out.println("Obecny miesiac to: " + now.getMonth());

        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3.withYear(0).withDayOfYear(100));
    }

    private static void method4() {
        LocalDate localDate = LocalDate.now();
        System.out.println("W domyślnym formacie: " + localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
        System.out.println(localDate.format(formatter)); // formatuje nam na Stringa
    }
    private static void method5 () {
        String date1 = "2018 10 3 20 01 11";
        String pattern = "yyyy HH M mm dd ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(date1, formatter);
        System.out.println(localDateTime);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm, d MMMM yyyy 'r.'");
        System.out.println(localDateTime.format(outputFormatter));

    }
    private static void method6() {
        LocalDate localDate = LocalDate.parse("2019-09-12");
        LocalDate localDate1 = localDate.parse("2018-12-30");
        Period period = Period.between(localDate,localDate1);
        System.out.println(period);

    }
    private static void method7() {
        LocalTime localTime = LocalTime.parse("12:30:02");
        LocalTime localTime1 = LocalTime.parse("16:00:00");
        Duration duration = Duration.between(localTime,localTime1);
        System.out.println(duration);
        System.out.println(String.format("okres czasi pomiędzy datami: %s godziny lub %s minut lub %s sekund",
                duration.toHours(),
                duration.toMinutes(),
                duration.getSeconds()));
    }
    private static void method8 () {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
        calendar.set(Calendar.HOUR, 8); // zmiana godziny w kalendarzu
        System.out.println(calendar.getTime());

    }
}
