/*
Utwórz metodę, która przyjmuje ciąg znaków (który zawiera tylko liczby), a następnie rozdziela elementy myślnikami.
Separator ma stać w tych miejscach by w danej grupie (pomiędzy myślnikami) były maksymalnie dwie liczby parzyste lub nieparzyste.
> Dla `2222222` zwróci`22-22-22-2`
> Dla `39933999393` zwróci`329-33-99-929-3`
 */
public class zadanie98 {
    public static void main(String[] args) {
        String output = spltter("2222222222");
        System.out.println(output);
    }

    static String spltter(String input) {
        // Nowy obiekt StringBuildera
        StringBuilder sb = new StringBuilder();
        // Podzielona tablica po każdym znaku
        String[] stringArray = input.split("");
        // Nowa tablica (już wartości 'int' a nie 'String')
        int[] array = new int[input.length()];
        // Graniczna wartość licznika
        int maxCounter = 2;

        // Zamiana wartości typu 'String' na 'int'
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        // Licznik wystąpień wartości parzystych
        int evenCounter = 0;
        // Licznik wystąpień wartości nieparzystych
        int oddCounter = 0;

        // Pętla po wszystkich wartościach
        for (int i = 0; i < array.length; i++) {
            // Sprawdzenie czy któryś z liczników osiągnął wartość graniczną
            if (evenCounter == maxCounter || oddCounter == maxCounter) {
                // Jeśli granica została osiągnięta to wstawiamy separator
                sb.append("-");
                // Oraz zerujemy liczniki
                evenCounter = 0;
                oddCounter = 0;
            }

            // Sprawdzamy który z liczników należy zwiększyć
            if (array[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

            // Dodajemy liczbę do wyniku
            sb.append(array[i]);
        }

        return sb.toString();
    }
}
