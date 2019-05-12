/*Utwórz klasę `Person` (`Osoba`) posiadającą
>*pola reprezentujące:*
>* imie
>* nazwisko
>* wiek
>* czyMezczyzna
>
>*konstruktor*
>
>*metody służące do:*
>* przedstawienia się (`Witaj, jestem Adam Nowak, mam 20 lat i jestem mężczyzną`)
>* sprawdzenia czy osoba jest pełnoletnia

 */
public class Person {
    private String name;
    private String lastName;
    private int age;
    private boolean isMale;

    Person(String name, String lastName, int age, boolean isMale) { // konstruktor nie posiada typu
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;

    }

    public String Introduce() {
        return String.format("Witaj, jestem %s %s, mam %s lat", // są dwa %s bo imię i nazwisko,
                name, lastName, age,
                isMale ? "mężczyzną" : "kobietą");
    }

    public boolean isAdult() {
        return age >= 18;

    }
        public String toString() {
            return Introduce();
        }
}
