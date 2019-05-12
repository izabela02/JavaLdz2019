/*Utwórz metodę, która przyjmuje dwa parametry będące szerokością (pierwszy paramet) i wysokością (drugi parametr) planszy. Metoda ma wypełnić i zwrócić tablicę wypełnioną spiralnie:
> dla parametrów `(4, 3)`
>
 ```1  2  3  4
10 11 12  5
 9  8  7  6```

 */
public class zadanie71extra {
    public static void main(String[] args) {

    }

    static int[][] spiral(int width, int length) {
        int[][] output = new int[length][width];
        int counter = 0;
        int horizontslindex = output[0].length;
        int verticalindex = 0;
        int counter2 = 0;

        while (counter <= width * length) {

            for (int i = 0; i < horizontslindex; i++) {
                output[verticalindex][horizontslindex] = counter;
                counter++;

            }
            verticalindex++;
            for (int i = 1; i < output.length - verticalindex; i++) {
                output[verticalindex][horizontslindex] = counter;
                counter++;


            }
            verticalindex++;
            for (int i = horizontslindex; i >= 0 + counter2; i--) {
                output[verticalindex][i] = counter;
                counter++;


            }
            counter2++;
            horizontslindex--;
            for (int i = verticalindex - counter2; i <= counter2; i--) {


            }


        }
        return null;
    }
}
