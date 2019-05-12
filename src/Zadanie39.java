public class Zadanie39 {
    public static void main(String[] args) {
        multiplicationTable(5);
    }
    static void multiplicationTable (int dimention) {
        for (int column = 1; column  <= dimention; column++) {

            for (int i = 1; i <= dimention; i++) {
                System.out.print(column * i + "\t");

            }
            System.out.println();
        }

    }
}
