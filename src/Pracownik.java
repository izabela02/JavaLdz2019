public class Pracownik {
    private String name;
    private String lastName;

    Pracownik(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }
    public String toString () {
        return name +" " + lastName;
    }
}
