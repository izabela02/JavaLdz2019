public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println(Min(15, 23, 22, 10));
        int wynik = (Min(9,33,14,59));
        System.out.printf("%s h i %s min", wynik/60, wynik % 60);
    }
        static int Min(int h1,int min1, int h2, int min2) {
            return (h2 - h1)*60 + (min2-min1);
        }
}
