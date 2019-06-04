package Day_01_06.Zadanie170;

public class Zwierze {

    static String imie; // pole statyczne

    Zwierze () {
        System.out.println("Jestem zwierzakiem");

    }
    {
        System.out.println("Blok inicjalizacyjny zwierzaka");
    }
    static {
        System.out.println("Statyczny blok inicjalizacyjny zwierzaka");
    }
}
