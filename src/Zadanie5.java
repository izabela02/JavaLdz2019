/*Utwórz metodę, w której przeprowadzisz operacje arytmetyczne (przed wszystkim dodawanie i mnożenie)
pomiędzy różnymi typami danych (np. `int` a `float`) i wyświetlisz ich wyniki. (edited)

 */

public class Zadanie5 {
    public static void main(String[] args) {
        float a = 2.3f;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);

        int c = 2;

        float result = b / (float) c; // (float) stosujemy przed zmienną, którą chcemy zmienić, wiemy, że wynik
        float result2 = 1.0f * b / c; // w tym przypadku zastosowaliśmy czynnik 1.0f bo zmienna b jest float
        System.out.println(result);
        System.out.println(result2);

    }

}
