public class Zadanie12 {
    public static void main(String[] args) {
        System.out.println(max1(1, 2, 3));
        System.out.println(max2(3, 23, 10));

    }

    static int max1(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    static int max2(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }
}



