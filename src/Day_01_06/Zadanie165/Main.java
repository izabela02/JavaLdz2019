package Day_01_06.Zadanie165;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Samochód samochod = new Samochód("111", Samochód.Kolor.BIAŁY);
        Samochód samochod2 = new Samochód("111", Samochód.Kolor.BIAŁY);
        Samochód samochod3 = new Samochód("123", Samochód.Kolor.ŻÓŁTY);
        System.out.println("samochod1 z samochod2: ");
        System.out.println(samochod.equals(samochod2));
        System.out.println("samochod2 z samochod3: ");
        System.out.println(samochod2.equals(samochod3));
        System.out.println("samochod1 z samochod3: ");
        System.out.println(samochod.equals(samochod3));

        Set<Samochód> samochody = new HashSet<>(Arrays.asList(samochod, samochod2, samochod3));

        System.out.println(samochody);
        System.out.println(samochod.hashCode());
        System.out.println(samochod2.hashCode());
        System.out.println(samochod3.hashCode());

    }
}
