/*
*ZADANIE #153*
Utwórz metodę która wykonuję operację dzielenia dwóch liczb przekazywanych jako parametry.
* W przypadku podzielenia przez `0` metoda powinna zwrócić nasz własny wyjątek
 */
public class Zadanie153 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(6, 0));
        } catch (DividedByZeroException e) {
            e.printStackTrace();
        }

        System.out.println(divideDouble(6.0, 0));
    }

    static int divide(int a, int b) throws DividedByZeroException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new DividedByZeroException();
        }
    }

    static double divideDouble(double a, double b) {
        double result = a / b;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new DivideDoubleByZeroException();
        }
        return result;
    }

    private static class DivideDoubleByZeroException extends RuntimeException {

    }
}



