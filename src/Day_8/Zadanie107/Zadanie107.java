package Day_8.Zadanie107;
/*ZADANIE #107*
 Utwórz klasę `Tablica` służącą do obsługi tablicy jednowymiarowej z możliwością dynamicznej zmiany rozmiaru.
 >*konstruktor:*
 >* jednoparametrowy (przyjmujący początkowy rozmiar tablicy)
 >
 >*pole:*
 >* będące tablicą (ale z modyfikatorem `private`!!!)
 >
 >*metody umożliwiające:*
 >* Wstawienie elementu na koniec
 >* Zwrócenie rozmiaru tablicy
 >* Wyświetlenie tablicy
 >* Rozszerzenie tablicy o wybraną liczbę pozycji na końcu (domyślnie o `1`)
 >* Wstawienie elementu na początek
 >* Wstawienie elementu pod wybranym indeksem
 >* Usunięcie elementu pod wybranym indeksem
 >* Zwrócenie największego elementu w tablicy
 */

public class Zadanie107 {
    public static void main(String[] args) {
        Data data = new Data(5);
        System.out.println(data.rozmiar());
        data.wstawienieNaKoniec(5);
        data.wstawianieDoIndeksu(1,2);
        data.wstawianieDoIndeksu(2,3);
        data.wstawienieNaPoczatek(1);
        data.usuniecieElementu(2);
        data.show();
        System.out.println(data.najwiekszy());
    }

}
