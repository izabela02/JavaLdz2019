/*Utwórz klasę `Student` posiadającą
>*pola reprezentujące:*
>* imie
>* nazwisko
>* wiek
>* płeć (typ wyliczeniowy)
>* pensję
>* adres (nową klasę `Address`)
>
>*gettery & settery*
>
>*następujący kostruktor:*
>* 3-parametrowy (przyjmujący imię, nazwisko i płeć)
>
>*metody zwracające:*
>* imie, drugie imie (jeśli istnieje!) i nazwisko (jako jeden string)
>* płec w formie tekstowej (tzn. `Kobieta` lub `Mężczyzna`)
>* liczbę lat pozostałych do emerytury (dla `Kobiet` 60, dla `Mężczyzn` 65)


Utwórz klasę `Company` (`Firma`) posiadającą listę osób (czyli obiektów, wcześniej utworzonej, klasy *Student*) oraz metody umożliwiające:
>* wyświetlenie listy pracowników
>* zwrócenie pracownika który zarabia najwięcej
>* zwrócenie najstarszego pracownika
>* zwrócenie liczby pracowników starszych niż podana wartość
>* przyznanie podwyżki procentowej (np. podnieść wszystkim o 10%)
>* przyznanie podwyżki kwotowej (np. wszystkim o 500 zł)
(edited)
*/

package Zadanie115;

import com.sun.jndi.cosnaming.IiopUrl;

public class Student {
    private String imie;
    private String drugieImie;
    private String nazwisko;
    private int wiek;
    private Plec plec;
    private double pensja;


    Student(String imie, String nazwisko, Plec plec, int wiek, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public Plec getPlec() {
        return plec;
    }

    public double getPensja() {
        return pensja;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String zwrocDaneStudenta() {
        return String.format("%s%s %s",
                imie,
                (drugieImie == null) ? "" : " " + drugieImie,
                nazwisko);
    }

    public String zwrocPlec() {
        return plec.wyswietlPLec();
    }

    public int pozostaloDoEmerytury() {
        return wiek >= plec.zwrocWiekEmerytalny() ?
                0 :
                plec.zwrocWiekEmerytalny() - wiek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", drugieImie='" + drugieImie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", plec=" + plec.wyswietlPLec() +
                ", pensja=" + pensja +
                '}';
    }

}

enum Plec {
    KOBIETA("Kobieta", 60),
    MEZCZYZNA("Mężczyzna", 65);

    private String opis;
    private int wiekEmerytalny;

    Plec(String opis, int wiekDoEmerytury) {
        this.opis = opis;
        this.wiekEmerytalny = wiekDoEmerytury;
    }

    public String wyswietlPLec() {
        return opis;
    }

    public int zwrocWiekEmerytalny() {
        return wiekEmerytalny;
    }
}
