public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println((isEven(9)));
        System.out.println(isEven2(12));
        System.out.println(isEven(9));

    }

    static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    static boolean isEven2(int a) {
        return a % 2 == 0;
    }
}


