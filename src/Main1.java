public class Main1 {

    public static void main(String[] args) {

        Person person = new Person("Jan",
                "Kowalski",
                17,
                true);

        System.out.println(person.Introduce());
        System.out.println(person.isAdult());

        Person person1 = new Person("Ewa",
                "Kowalska",
                33,
                true);

        System.out.println(person.Introduce());
        System.out.println(person.isAdult());

    }

    }