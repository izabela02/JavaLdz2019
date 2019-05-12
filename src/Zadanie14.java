public class Zadanie14 {
    public static void main(String[] args) {
        System.out.println(liczbyParzyste(4, 5));
        System.out.println(liczbyParzyste1(4, 4));
        System.out.println(jednaParzysta(4,7));

    }

    static boolean liczbyParzyste(int a, int b) { //  sprawdza czy obie są parzyste
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    static boolean liczbyParzyste1(int a, int b) { // sprawdza czy obie wartości są parzyste
        return a % 2 == 0 && b % 2 == 0;

    }

    static boolean jednaParzysta(int a, int b) {
        return a % 2 == 0 || b % 2 == 0;
    } // sprawdza czy jedna z nich jest parzysta
}


