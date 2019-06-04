package Day_01_06;
/*
*ZADANIE #163 - REKURENCJA*
Utwórz metodę, która przyjmie liczbę (jako `int`) a następnie przy użyciu *REKURENCJI* policzy sumę cyfr.
 */

public class Zadanie163 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(241));

    }

    static int sumOfDigits(int nums) {
        System.out.println("Przekazano: " + nums);
        if (nums <= 0) {
            return 0;
        } else {
            return nums % 10 + sumOfDigits(nums / 10);
        }
    }
}
