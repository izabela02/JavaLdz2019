/*
*ZADANIE #96*
REGEX - `adres email`
 */

public class Zadanie96 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9][a-zA-Z0-9_.\\-+*]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+";
        System.out.println("andrzej@sda.com".matches(regex));
    }
}



