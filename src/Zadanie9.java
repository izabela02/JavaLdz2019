public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println(test(6));
        System.out.println(test(22));
        System.out.println(test2(6));
        System.out.println(test2(22));
        System.out.println(test3(6));
        System.out.println(test3(19));
        System.out.println(test5(6));
        System.out.println(test5(22));

    }

    static boolean test(int num1) {
        if (num1 >= 20) {
            return true;

        } else {

            return false;

        }

    }


    static String test2(int num1) {
        if (num1 >= 20) {
            return "Tak, liczba " + "num1" + " jest większa od 20";

        } else {

            return "Tak, liczba " + "num1" + " jest mniejsza od 20";

        }


    }

    static String test3(int num1) {
        if (num1 >= 20) {
            return String.format("Liczba %s jest większa bądź równa 20", num1);
        } else {
            return String.format("Liczba %s jest mniejsza od 20", num1);
        }


    }

    static String test5(int num1) {

        String out;

        if (num1 > 20) {
            out = "większa od";
        } else if (num1 == 20) {
            out = "równa";
        } else {
            out = "mniejsza od";
        }

        return String.format("Liczba %s jest %s 20", num1, out);
    }
}
