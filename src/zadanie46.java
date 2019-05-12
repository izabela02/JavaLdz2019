/*
 Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę wszystkich elementów

*/
public class zadanie46 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        int[] nums2 = {1, 2, 3, 4, 5,};
        System.out.println(sumofArray(nums));
        System.out.println(sumofArray(nums2));

    }

    static int sumofArray(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
