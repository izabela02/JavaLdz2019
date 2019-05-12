public class Zadanie40 {
    public static void main(String[] args) {
        squareDigits(1234);

    }

    static int squareDigits(int n) {
        String output = "";
        int divided = n;
        while (divided != 0) { //!=0 - róźne od zera
            // wyciągamy ostatnią cyfrę z podanej liczby
            int div2 = divided % 10;
            //odcinamy ostatnią cyfrę od wartości nad którą pracujemy
            divided = divided / 10;


            output = div2 * div2 + output;

        }
        System.out.println(output); //Integer.pareInt(a), fortmatuje ze string do int
        return 0;
    }

}
