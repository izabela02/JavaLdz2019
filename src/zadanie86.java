/*
*ZADANIE #86*
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca *średnią* wartość elementów z pominięciem największego.
> dla `[1, 2, 3, 10, 4, 5, 6, 11]`
> zwróci `31` (ponieważ pomija `11`)
 */
public class zadanie86 {
    public static void main(String[] args) {
        int [] testArray = {1,2,3,10,4,5,6,11};
        System.out.println(avarage(testArray));

    }

    static double avarage(int[] array) {
        int max = array[0];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
            sum += array[i];
        }
        return (sum - max) / (array.length - 1);
    }

}
