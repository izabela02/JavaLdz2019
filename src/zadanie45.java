/*
 Utwórz metodę, która przyjmuje wyraz, a następnie zwraca informacje czy zawiera on samogłoski czy nie. (edited)

public class zadanie45 {
    */

class zadanie45 {
    public static void main(String[] args) {
        System.out.println(vowels("hej, siemanko"));

    }

    static boolean vowels (String text) {
       return text.contains("a")
                || text.contains("e")
                || text.contains("i")
                || text.contains("o")
                || text.contains("u")
                || text.contains("y");
    }
}
