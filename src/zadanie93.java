/*REGEX - `imię (opcjonalne drugie imię) nazwisko`

 */

public class zadanie93 {
    public static void main(String[] args) {
    String regex = "[a-zA-z1-9]+ ([a-zA-z]+ )?[a-zA-z]+";
    /*a-zA-z - są jakieś litery, + wystąpi albo 1 raz albo wiele razy, następnie spacja tak jak po moim imieniu,

     */
        System.out.println("Iza93 Borkowska".matches(regex));
        System.out.println("Iza Anna Borkowska".matches(regex));
        System.out.println("Iza  Borkowska".matches(regex));
        System.out.println(" ".matches(regex));
        System.out.println("bb".matches(regex));
        System.out.println("b b".matches(regex));
    }

}
