package Day_01_06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie176 {
    public static void main(String[] args) {
        //  method1();
        // method2();
        // method3();
        //method5(23654478);
        // method6();
        method7();

    }

    public static void method1() {
        IntStream.range(10, 20)
                .forEach(liczba -> System.out.println(liczba));
    }

    public static void method2() {
        IntStream.range(15, 120)
                .filter(liczba -> liczba % 3 == 0)
                .forEach(liczba -> System.out.printf("%s, ", liczba));

    }

    public static void method3() {
        Random random = new Random();
        List<Integer> list = random.ints(10, 10, 30)
                .boxed() // zamienia wartosci prymitywne na klasowe, zamienia int na Integer
                .collect(Collectors.toList());
        System.out.println(list);

    }

    public static void method4() {

        int[] testArray = {1, 2, 3, 4, 5, 6};
        List<String> list = Arrays.stream(testArray)
                .filter(liczba -> liczba % 2 == 0)
                .mapToObj(liczba -> String.valueOf(liczba))
                .collect(Collectors.toList());
    }

    public static void method5(int inputNumber) {
        String[] stringArray = String.valueOf(inputNumber).split(""); // liczbę wejściową zamieniam na Stringa i tnę po znakach
        List<Integer> list = Arrays.stream(stringArray)
                .map(liczba -> Integer.valueOf(liczba))
                .collect(Collectors.toList()); // collect zbiera nam dane do listy

        System.out.println(list);
    }

    public static void method6() {
        List<String> testList = Arrays.asList("A", "B", null, null, "C", "", "B");
        List<String> list = testList.stream()
                .filter(napis -> napis != null)
                .filter(napis -> napis.length() > 0)
                .collect(Collectors.toList());
        System.out.println(list);
    }
    public static void method7 () {
        List<String> test1 = Arrays.asList("Iza", "jedź", "do", "domu");
        List<String> list = test1.stream()
             //   .filter(napis->napis.contains("a")) // zawieraja literę a
                .filter(napis->napis.matches(".*[aA].*")) // zawieraja litere a lub A
                .map(napis->napis.toLowerCase()) // zawierają duże litery
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);
    }
    public static void method() {
        List<String> test1 = Arrays.asList("Iza", "jedź", "do", "domu");
        List<String> list = test1.stream()
                .filter(napis-> {
                    System.out.println("Rozpatrujemy czy " + napis + " konczy sie na a");
                    if (napis.endsWith("a")) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .map(napis -> {
                    return napis.toUpperCase();
                })
                .collect(Collectors.toList());

        System.out.println(list);

    }
}




