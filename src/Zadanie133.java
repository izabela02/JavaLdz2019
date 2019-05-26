/*
*ZADANIE #133*
Utwórz metody które będą testować czas działania dwóch implementacji listy (tzn. `List`) - `ArrayList` i `LinkedList`.
Do pomiaru czasu wykorzystaj wartości zwracane przez metodę `System.currentTimeMillis();`.

Sprawdź czas:
> wstawiania na koniec (np. 500_000 elementów)
> wstawiania na początek (np. 500_000 elementów)
> wybierania po indeksie (tzn. 500_000 razy pobierz element pod jakimś indeksem)
> sumowania wszystkich elementów przy wykorzystaniu pętli - for
> sumowania wszystkich elementów przy wykorzystaniu pętli - foreach
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Zadanie133 {

    private static final int COUNTER = 500_000;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();
            arrayList = getFilledList(arrayList);
            linkedList = getFilledList(linkedList);
            long start = System.currentTimeMillis();
            sumFor(arrayList);
            long stop = System.currentTimeMillis();
            System.out.println("Array " + (stop - start));
            start = System.currentTimeMillis();
            sumFor(linkedList);
            stop = System.currentTimeMillis();
            System.out.println("Linked " + (stop - start));
        }


    }


    static void addAtEnd(List<Integer> list) {
        for (int i = 0; i < COUNTER; i++) {
            list.add(i);
        }
    }

    static  void addAtBegin(List<Integer> list) {
        for (int i = 0; i < COUNTER; i++) {
            list.add(0,i);
        }
    }

    static void addElementAtRandomIndex(List<Integer> list) {
        Random rnd = new Random();
        list.add(0);
        for (int i = 0; i < COUNTER; i++) {
            list.add(rnd.nextInt(list.size()),i);
        }
    }

    static List<Integer> getFilledList(List<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < COUNTER; i++) {
            list.add(rnd.nextInt(1000));
        }
        return list;
    }

    static long sumFor(List<Integer> list) {
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    static long sumForEach(List<Integer> list) {
        long sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}