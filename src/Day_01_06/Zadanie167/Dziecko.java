package Day_01_06.Zadanie167;
/*
*ZADANIE #167 - interfejs `Comparable`*
Utwórz klasę `Dziecko` z polami `imie` i `wiek` oraz zaimplementuj interfejs `Comparable` (edited)
 */

public class Dziecko implements Comparable<Dziecko> {

    private String name;
    private int age;
    private String lastName;


    public Dziecko(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;


    }

    // metoda do porównywania dwóch obiektów Dziecko
    @Override
    public int compareTo(Dziecko dziecko) {
        // Jeżeli wiek obiektu w parametrze równa się obiektowi rozpatrywanemu
        // to porównujemy obiekty względem imienia
        if (dziecko.getAge() == age) {
            // zmienna z porównaniem imion obiektów
            int compareName = name.compareTo(dziecko.getName());
            // przypadek, gdy imiona obiektów są takie same
            if (compareName == 0) {
                // następnie porównujemy nazwisko i zwracamy wynik
                return lastName.compareTo(dziecko.getLastName());
            }
            // jeśli wiek jest równy, ale imiona są różne to zwracamy porównanie imion
            return compareName;

        }// jeżeli wiek jest różny w obiektach
        // w pierwszej kolejnosci porownujemy obiekty wzgledem wieku
        return age - dziecko.getAge();
    }

    @Override
    public String toString() {
        return name + " " + lastName + " - " + age;
    }
}
