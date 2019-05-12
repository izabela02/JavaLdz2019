public class zadanie10 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        System.out.println(mniej(a, b));
        System.out.println(mniejsza(a, b));
        System.out.println(jeszczemniej(a, b));
    }

    static int mniejsza(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    static int mniej(int c, int d) {
        return Math.min(c, d);

    }

    static int jeszczemniej(int a, int b) {
        return a < b ? a : b; // co dokładnie oznacza ten zapis?

    }
}




