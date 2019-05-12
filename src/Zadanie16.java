/*Utwórz metodę, która przyjmuje wartość produktu oraz procent podatku jaki należy naliczyć, a następnie zwraca kwotę po opodatkowaniu.
> Dla przekazanych parametrów `100, 23`,
>
>powinno zwrócić `123`
*/
public class Zadanie16 {
    public static void main(String[] args) {
        int a = 100;
        int b = 23;
        int c = 400;
        System.out.println(a * ((b + 100) / (float) 100));
        System.out.println(c * ((b + 100) / (float) 100));

    }

}

