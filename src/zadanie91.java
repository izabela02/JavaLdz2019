/*
Utwórz metodę, która wykorzystuje *varargs* by przekazać
do metody dowolną, większą od zera, liczbę elementów typu
`String` i zwrócić jeden napis sklejony z nich.

 */
public class zadanie91 {
    public static void main(String[] args) {
        System.out.println(sklejone("Wonder", "woman", "to", "słabizna"));

    }

    static String sklejone(String pierwszyelement, String... elementy) {
        StringBuilder zdanie = new StringBuilder(pierwszyelement);
        for (int i = 0; i < elementy.length; i++) {
            zdanie.append(" ").append(elementy[i]); // append skleja, dodaje kolejne elementy

        }
        return zdanie.append(".").toString();
    }
}
