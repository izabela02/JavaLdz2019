/*ZADANIE27*
 Utwórz metodę, do której przekazujesz znak (typ `char`) oraz dwie liczby.
 Znak przedstawia operację matematyczną którą należy wykonać (np. `+`, `-`, `*`...).

 Wykorzystaj instrukcję warunkową *switch*

 > Dla `'+', 1, 2` zwróci `3` (bo `1 + 2 = 3`)
 >
 > Dla `'-', 3, 5` zwróci `-2` (bo `3 - 5 = -2`)
 */

    public class Zadanie27 {
        public static void main(String[] args) {
            System.out.println(calc('+', 1,2));
            System.out.println(calc('-', 3,5));
            System.out.println(calc('*', 2,4));
            System.out.println(calc('/', 4,9));

        }
        static double calc (char operator, int a, int b) {
            switch (operator) {
                case '+':
                    return a+b;
                case '-':
                    return a-b;
                case '*':
                    return a*b;
                case '/':
                    return (double)a/b;
                default:
                    return 0;
            }
        }
    }

