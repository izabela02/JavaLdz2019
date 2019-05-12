public class Zadanie37 {
    public static void main(String[] args) {
        numbersAnddividers(2, 10);

    }

    static void numbersAnddividers(int start, int end) {
        for (int number = start; number <= end; number++) {
            System.out.print(number + "<--"); // bez ln, żeby było w jednej linii

            for (int j = 1; j <= number; j++)
                if (number % j == 0) {
                    System.out.print(j + ", "); // bez ln, żeby było w jednej linii
                }

            System.out.println();

        }


    }
}
