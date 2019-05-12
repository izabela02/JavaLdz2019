public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println(hello("Piotr", 88, true));
        System.out.println(hello("Weronika", 36, false));


    }

    static String hello(String imie, int wiek, boolean czyMezczyzna) {
        return String.format(
                "Cześć! Jestem %s, mam %s lat i jestem %s",
                imie,
                wiek,
                czyMezczyzna ? "mężczyzną" : "kobietą");

    }

    }






