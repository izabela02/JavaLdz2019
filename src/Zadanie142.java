import java.util.HashMap;
import java.util.Map;

/*ZADANIE #142*
Utwórz metodę, które zwróci mapę gdzie kluczem jest skrót kraju (np. “PL”, “DE”, “ES”),
a wartościami pełna nazwa ( np. `Polska`, `Niemcy`, `Hiszpania`)
 */
public class Zadanie142 {
    public static void main(String[] args) {
        System.out.println(kraje());

    }
    static Map<String,String> kraje() {
        Map<String, String> output = new HashMap<>();
        output.put("PL", "Polska");
        output.put("DE", "Niemcy");
        output.put("ES", "Hiszpania");
        return output;
    }

}
