package Day_01_06;
/*
*ZADANIE #164 - REKURENCJA*
Utwórz metodę, która przyjmie String jako parametr i sprawdzi czy parametr jest PALINDROMEM (edited)
 */

public class Zadanie164 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kajak"));
        System.out.println(isPalindrome("niekajak"));
        System.out.println(isPalindrome("abba"));

    }
    private static boolean isPalindrome(String word) {
        if (word.length() <= 1) { // wrzucamy napis o długości 1 lub 0
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length()-1)) {
            return isPalindrome(word.substring(1,word.length()-1));

        }
        return false;
    }
}
