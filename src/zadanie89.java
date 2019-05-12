/*
Porównaj czas sumowanie elementów przy użyciu klas:
- `String`
- `StringBuilder()`
(ew. jeszcze `StringBuffer()`) (edited)
*/
public class zadanie89 {

    public static void main(String[] args) {
        int howmany = 10000;
        long start = System.currentTimeMillis();

        testString(howmany);
        long end = System.currentTimeMillis();
        System.out.println("String time " + (end - start));

        start = System.currentTimeMillis();
        testBuilder(howmany);
        end = System.currentTimeMillis();
        System.out.println("String builder " + (end-start));

        start = System.currentTimeMillis();
        testBuffer(howmany);
        end = System.currentTimeMillis();
        System.out.println("String buffer " + (end-start));
    }

    static void testString(int howmany) {
        String text = "";
        for (int i = 0; i < howmany; i++) {
            text += "C";
        }
    }

    static void testBuilder(int howmany) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < howmany; i++) {
            text.append("C");
        }
    }
    static void testBuffer (int howmany) { // jest bezpieczniejszy
        StringBuffer text = new StringBuffer();
        for (int i = 0; i < howmany; i++) {
            text.append("C");
        }
    }
}
