/*ZADANIE #88*
 Utwórz metodę, która przyjmuje ciąg znaków, a odwraca każdy z wyrazów i zwraca całość jako jeden napis.
 > Dla `"ala ma kota"` zwróci `"ala am atok"`
 > Dla `"dzisiaj jest sobota"` zwróci `"jaisizd tsej atobos"`

 */
public class zadanie88 {
    public static void main(String[] args) {
        System.out.println(result("Dzisiaj"));
        System.out.println(result("Ala ma kota"));

    }

    static String result(String words) {
        String[] returnArray = words.split(" ");
        String addedWords = "";
        for (int i = 0; i < returnArray.length; i++) {
             addedWords += reverseWords(returnArray[i]) + " ";

        }
        return addedWords;

    }

    static String reverseWords(String words) {
        String[] returnArray = words.split("");
        String output = "";
        for (int i = 0; i < words.length(); i++) {
            output = returnArray[i] + output;
        }
        return output;
    }


}
