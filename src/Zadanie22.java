public class Zadanie22 {
    public static void main(String[] args) {
        System.out.println(czyWprzedziale(15));
        System.out.println(czyWprzedziale(8));
        System.out.println(czyWprzedziale(30));
        System.out.println(czyWprzedziale(45));
        System.out.println(czyWprzedziale(60));

    }

    static boolean czyWprzedziale(int liczba) {
        return (liczba >= 10 && liczba <= 20) || (liczba >= 40 && liczba <= 50);

        }
    }

