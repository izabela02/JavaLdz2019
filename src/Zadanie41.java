public class Zadanie41 {
    public static void main(String[] args) {
        tree(4);

    }

    static void tree(int row) {
        int counter = 0;
        for (int i = 1; i <= row; i++)
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.print(counter + "\t");

            }
            System.out.println(); // dokończyć
    }
}
