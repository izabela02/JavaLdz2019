public class Zadanie97 {
    public static void main(String[] args) {
        String regex = "https?://(www.)?([a-z0-9]+.)+[a-z]+";
        System.out.println("https://www.teksty.stronawww.pl".matches(regex));
    }

}
