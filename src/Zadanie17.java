/*Utwórz metodę, która przyjmuje 4 parametry i zwraca wynik wynik równania:
`a^(x) + b^(x+1) + c^(x+2)`. Gdzie `a`, `b`, `c` to pierwsze trzy parametry, a `x` jest czwartym parametrem.
>Dla `1, 2, 3, 8` powinno policzyć `1^8 + 2^9 + 3^10`
>
>Dla `10, 11, 12, 1` powinno policzyć `10^1 + 11^2 + 12^3`
>
>Dla `8, 8, 8, 3` powinno policzyć `8^3 + 8^4 + 8^5`
 */

    public class Zadanie17 {
        public static void main(String[] args) {
            System.out.println(równanie(1, 2, 3, 8));
            System.out.println(równanie1(10, 11, 12, 1));
            System.out.println(równanie2(8, 8, 8, 3));

        }

        static double równanie(int a, int b, int c, int x) {
            return Math.pow(a, x) + Math.pow(b, (x + 1)) + Math.pow(c, (x + 2));
        }

        static double równanie1(int a, int b, int c, int x) {
            return Math.pow(a, x) + Math.pow(b, (x + 1)) + Math.pow(c, (x + 2));

        }

        static double równanie2(int a, int b, int c, int x) {
            return Math.pow(a, x) + Math.pow(b, (b - 4)) + Math.pow(c, (c - 3));
        }
    }


