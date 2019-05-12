/*
*ZADANIE #6*
Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci ich sumę
> Dla `2` oraz `11` zwróci `13`
>
> Dla `-10` oraz `3` zwróci `-7`

 */
public class cwiczenia {

    public static void main(String[] args) {
        System.out.println(suma(5,10));
        System.out.println(suma(-10,3));

        int result = suma(5, 10);
        System.out.println(result);

    }

    static int suma(int a, int b) {
        return a + b;
    }

}