import java.util.Arrays;
import java.util.List;

/*ZADANIE #135*
 Utwórz metodę, która przyjmuje listę wyrazów (obiekty klasy `String`) a następnie zwraca `String` gdzie:
 - do każdego wyrazu parzystej długości, doklei NA POCZĄTKU tyle `*` jakiej długości jest wyraz
 - do każdego wyrazu nieparzystej długości, doklei NA KOŃCU tyle `*` jakiej długości jest wyraz
 ```A  BB   CCC  DDD```
 ```A*   **BB   CCC***  DDD***```
*/public class Zadanie135 {
    public static void main(String[] args) {
        List<String> sampleText = Arrays.asList("Ala", "ma", "kota");
        System.out.println(prettyPrint(sampleText));
    }

    static String prettyPrint(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String word : list) {
            if (word.length() % 2 == 0) {
                result.append(addStars(word.length()));
                result.append(word);
            } else {
                result.append(word);
                result.append(addStars(word.length()));
            }
            result.append("  ");
        }
        return result.toString();

    }

    static String addStars(int num) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stars.append("*");
        }
        return stars.toString();
    }
}
