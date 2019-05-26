/*ZADANIE #139*
Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania duplikatu a następnie zwraca set (np. `HashSet`) (z podanymi liczbami)
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie139 {
    public static void main(String[] args) {
        System.out.println(takeNumbers());
    }
    static Set<Integer> takeNumbers (){
        Set<Integer> numbers = new HashSet<>();
        Scanner numb = new Scanner(System.in);
        while (numbers.add(numb.nextInt())); // nextInt() - odczytuje kolejną liczbę całkowitą
        return numbers;
    }
}


