public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(potega3(2));
        System.out.println(potega3(3));
        System.out.println(potega2(2));
        System.out.println(potega2(3));

        int wynik = potega3(2);
        //System.out.println(potega3(2));
        System.out.println(wynik);

        double wynik2 = potega2(300);
        System.out.println(wynik2);
        System.out.printf("%.0f",wynik2);

    }


    static int potega3(int potegowanie) {
        return potegowanie * potegowanie * potegowanie;
    }

    static double potega2(int potegowanie) {
        return Math.pow(potegowanie, 3);


    }
}
