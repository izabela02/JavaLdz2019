public class Zadanie21 {
    public static void main(String[] args) {
        System.out.println(theSame(1, 2, 3));
        System.out.println(theSame1(1, 1, 7));
        System.out.println(theSame2(-10, 2345, 0));
        System.out.println(theSame3(22, 22, 22));
        System.out.println(theSame4(-7, -7, -7));

    }

    static boolean theSame(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        } else {
            return false;
        }
    }

    static boolean theSame1(int d, int e, int f) {
        if (d == e && e == f && d == f) {
            return true;
        } else {
            return false;
        }

    }

    static boolean theSame2(int g, int h, int i) {
        if (g == h && h == i && g == i) {
            return true;
        } else {
            return false;
        }
    }

    static boolean theSame3(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        } else {
            return false;
        }
    }

    static boolean theSame4(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        } else {
            return false;
        }
    }
}

