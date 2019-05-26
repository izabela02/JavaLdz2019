/*ZADADNIE #132*
 Utwórz metodę, która przyjmuje tablicę wyrazów (obiekty klasy `String`) a następnie wyświetla je w formie “schodów”
 `["hello", "world"]`
hello
    w
    o
    r
    l
    d```

`["another", "test", "string"]`
another
      t
      e
      s
      tstring



`["programming", "puzzles", "and", "code", "golf"]`
programming
          p
          u
          z
          z
          l
          e
          sand
             c
             o
             d
             egolf```

`["a", "single", "a"]`
a
s
i
n
g
l
ea
 */

public class Zadanie132 {
    public static void main(String[] args) {
        schodki(new String[]{"Ala", "makota", "Alusia", "Kotka", "posiada", "Kotki", "Pieski", "Wszystkie", "zwierzeta"});
    }

    static void schodki(String[] tablica) { // metoda nic nie zwraca, przyjmuje tablicę Stringów
        int spaceCounter = 0; // początkowa wartość (nasze wcięcie) ilości spacji
        for (int i = 0; i < tablica.length; i++) { // przechodzimy po tablicy wyrazów
            if (i % 2 == 0) { // jeżeli nasz index jest podzielny przez 2 tgo wyświetlam wyraz pionowa (łamię linię)
                System.out.println(tablica[i]);
            } else {
                String[] letters = tablica[i].split(""); // Metoda split na podstawie wyrażenia regularnego rozbija ciąg znaków na fragmenty.
                spaceCounter += tablica[i - 1].length() - 1;
                for (int j = 0; j < letters.length; j++) {
                    spacje(spaceCounter);
                    if (j == letters.length - 1) {
                        System.out.print(letters[j]);
                        spaceCounter++;
                    } else {
                        System.out.println(letters[j]);
                    }
                }
            }
        }
    }

    static void spacje(int liczba) {
        for (int i = 0; i < liczba; i++) {
            System.out.print(" ");
        }
    }
}