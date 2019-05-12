/*Complete the solution so that it reverses the string value passed into it.

 */
public class zad10 {
    public static void main(String[] args) {
        System.out.println(word("dlrow"));
        System.out.println(newMethod("dlrow"));

    }

    static String word(String example) {
        String newWord = "";
        String[] nowaTablica = example.split(""); // zamiana napisu na tablicę

        for (int i = 0; i < example.length(); i++) {
            newWord = nowaTablica[i] + newWord;

        }
        return newWord;

    }

    static String newMethod(String example2) {
        String newWord = "";
        String[] array = example2.split("");
        for (int i = 0; i < example2.length(); i++) {
            newWord = newWord + array[array.length-1-i];
        }
        return newWord;

    }
}
