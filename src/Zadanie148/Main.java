package Zadanie148;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Samochód toyota = Samochód.getInstance("Toyota", Kolor.BIAŁY, "EL123");
    static Samochód mercedes = Samochód.getInstance("Mercedes", Kolor.CZARNY, "EL521");
    static Samochód bmw = Samochód.getInstance("bmw", Kolor.FIOLETOWY, "EL5216");
    static Samochód polonez = Samochód.getInstance("polonez", Kolor.NIEBIESKI, "EL521");

  public static void main(String[] args) {

      Map<String, Samochód> samochody = new HashMap<>();
      samochody.put(toyota.getNrRejestracji(),toyota);
      samochody.put(mercedes.getNrRejestracji(),mercedes);
      samochody.put(bmw.getNrRejestracji(),bmw);
      // samochody.put(polonez.getNrRejestracji(),polonez);

      Scanner dawajBlachy = new Scanner(System.in);
      System.out.println("Wpisz numer rejestracyjny pojazdu");
      String odczyt = dawajBlachy.nextLine();
      Samochód obiektPojazdu = samochody.get(odczyt);
      if (obiektPojazdu == null) {
          System.out.println("Nie znaleziono pojazdu");
      } else {
          System.out.println(obiektPojazdu);
      }


  }


}