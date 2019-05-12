/*Utwórz klasę `Rownanie` służącą do policzenia rownania `a^2 + b^3 + c^4`. Klasa powinna zawierać:
>*pola:*
>* `a`, `b`, `c`
>
>*kostruktory:*
>* bezparametrowy
>* 3-parametrowy
>
>*metody:*
>* liczaca wartosc rownania
>* przyjmującą liczbę a następnie zwracająca informację (`boolean`) czy wartość równania przekroczyła podaną liczbą (
jako parametr)

*/

public class Równanie {
    private int a;
    private int b;
    private int c;

    Równanie(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    double equationValue() {
   //     return Math.pow(a, 2) + Math.pow(b, 3) + Math.pow(c, 4);
     return equationValue(2);
    }

    double equationValue(int x) {
        return Math.pow(a, x) + Math.pow(b, x + 1) + Math.pow(c, x + 2);
    }
    /*
    przyjmująca liczbę a następnie zwracająca informację `boolean` czy wartość równania przekroczyła podaną
     liczbę jako parametr
     */

    boolean isEquationValueBigger (int inputValue) {
        return equationValue() > inputValue;
    }
    boolean isEquationValueBigger2 (int inputValue, int x) {
        return equationValue(x)>inputValue;
    }
}
