public class Zadanie25 {
    public static void main(String[] args) {
        System.out.println(month(1));
        System.out.println(month(2));
        System.out.println(month(3));
        System.out.println(month(4));
        System.out.println(month(5));
        System.out.println(month2(1));
        System.out.println(month2(2));
        System.out.println(month2(3));
        System.out.println(month2(5));


    }

    static String month(int mm) {
        switch (mm) {
            case 1:
                return "styczeń";
            case 2:
                return "luty";
            case 3:
                return "marzec";
            case 4:
                return "kwiecień";
            default: // warunek wejściowy  mm=5 nie został dopasowany, stąd stosujemy wariant domyślny default
                return "nieznany miesiąc";

        }

    }

    static String month2(int mm) {
        String name = "Nieznany miesiąc";
        switch (mm) {
            case 1:
                name = "Styczeń";
                break;
            case 2:
                name = "Luty";
                break;
            case 3:
                name = "Marzec";
                break;



        }
        return name;
    }
}


