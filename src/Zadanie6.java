public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println(suma(2, 11));
        System.out.println(suma(-10, 3));

        int result = suma(2, 11);
        System.out.println(result); // wyświetlenie wyniku
    }

    static int suma(int a, int b) { // ta metoda zwraca liczbę 13 typu int, zwraca wynik bez podania argumentów
        return a + b;
    }
}

