/*
REGEX - `adres IP`

 */
public class Zadanie95 {
    public static void main(String[] args) {
        String regex = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{1}\\.[0-9]{1}"; // żeby zastosować kropkę muszę postawić \\
        String regex2 = "([0-9]{1,3}\\.){3}[0-9]{1,3}";
        String ID = "192.163.1.8";
        System.out.println("192.163.1.8".matches(regex));
        System.out.println("192.163.1.8".matches(regex2));
        String regex3 = "([1-2][0-5][0-5]\\.){3}[1-2][0-5][0-5]";
        String regex4 = "([0-9]{1,3}.){3}[0-9]{1,3}";
        System.out.println("255.255.255.1".matches(regex4));
    }

}
