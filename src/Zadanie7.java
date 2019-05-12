public class Zadanie7 {

    public static void main(String[] args) {
        suma(5, 3);


    }

    static void suma(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.printf("%s - %s = %s \n", a, b, a - b);
        System.out.printf("%s * %s = %s \n", a, b, a * b);
        System.out.printf("%s / %s = %s \n", a, b, a / (float)b);

    }
}