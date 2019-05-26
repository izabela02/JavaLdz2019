package Day_8.Zadanie106;
/*Utwórz klasę `Date` (`Data`) posiadającą
>*Pola reprezentujące:*
>* dzień
>* miesięc
>* rok
>
>*Następujący kostruktor:*
>* 3-parametrowy (przyjmujący wszystkie parametry)
>
>*Metody umożliwiające:*
>* ustawienie dnia (wraz ze sprawdzaniem poprawności) - zwracająca typ `boolean`
>* ustawienie miesiąca (wraz ze sprawdzaniem poprawności) - zwracająca typ `boolean`
>* ustawienie roku (wraz ze sprawdzaniem poprawności) - zwracająca typ `boolean`
>* wyświetlenie daty w formacie `dzien-miesiac-rok` (opcjonalnie z możliwością ustawienia separatora)
>* wyświetlenie daty w formacie `rok-miesiac-dzien` (opcjonalnie z możliwością ustawienia separatora)
 */

public class Zadanie106 {
    public static void main(String[] args) {
        Data data =  new Data (2000,11,12);
        data.showDate("::");
        data.showDate();
        System.out.println(data);

    }
}
