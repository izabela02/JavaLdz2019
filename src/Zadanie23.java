public class Zadanie23 {
    public static void main(String[] args) {
        System.out.println(howFar(10));
        System.out.println(howFar(11));
        System.out.println(howFar(18));
        System.out.println(howFar(22));
        System.out.println(howFar(25));
        System.out.println(howFar(33));

    }

    static int howFar(int number) {
        if (number >= 11 && number <= 22) {
            return 0;
        } else if (number < 11) {
            return 11-number;
        } else {
            return 22-number;
        }
    }
}

