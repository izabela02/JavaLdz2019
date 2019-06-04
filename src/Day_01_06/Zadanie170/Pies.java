package Day_01_06.Zadanie170;

public class Pies extends Zwierze {
    static String imie;

    Pies() {
        System.out.println("Jestem pieskiem");
    }

    {
        System.out.println("1.Blok inicjalizacyjny pieska");
    }

    {
        System.out.println("2.A to kolejny blok i.");
    }

    {
        System.out.println("3.I jeszcze jeden...");
    }

    static {
        System.out.println("Statyczny blok inicjalizacyjny pieska");
        imie = "Bogdan";
    }

}
