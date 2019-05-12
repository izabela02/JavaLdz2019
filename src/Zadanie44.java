/*Utwórz metodę, która przyjmuje zdanie (np. `"Ala ma kota."` lub `"Dziś jest sobota"`),
a następnie ma zwrócić sumę długości wszystkich wyrazów
(bez białych znaków, czyli np. spacji)

 */

 class Zadanie44 {
    public static void main(String[] args) {
        System.out.println(sumadlugosci("Ala ma kota"));

    }

    static int sumadlugosci(String napis) {
        return napis.replaceAll(" ", "").length();

    }


}
