/* *ZADANIE #154*
Utwórz metodę, która przyjmuje parametry typu `int` korzystając z mechanizmu `varargs`. W przypadku nie przekazania żadnego parametru,
metoda powinna rzucić własny wyjątek (z komunikatem o powodzie). W przypadku podania parametrów, metoda powinna zwrócić ich sumę.
 */
public class Zadanie154 {
    public static void main(String[] args) {
        try {
            System.out.println(sum());
        } catch (NoInputException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(sum(1,1,1,1,1));
        } catch (NoInputException e) {
            e.printStackTrace();
        }


    }

    private static int sum(int... numbers) throws NoInputException {
        if (numbers == null || numbers.length == 0) {
            throw new NoInputException();

        }
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
        }
    }

    class NoInputException extends Exception {
    public NoInputException() {
        super("Hej kolego czegoś zapomniałeś");
    }
    }