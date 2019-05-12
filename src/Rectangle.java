/*

Utwórz klasę `Rectangle` (`Prostokąt`) posiadającą
>*pola reprezentujące:*
>* dłuższy bok
>* krótszy bok
>
>*konstruktory oraz metody służące do:*
>* policzenia obwodu
>* policzenia pola powierzchni
>* porównania czy pola powierzchni dwóch przekazanych prostokątów są takie same (zwracająca wartość `boolean`)
>
>*Utwórz tablicę zawierającą 5 obiektów tej klasy i w pętli wyświetl zdania w formie*
>`10 x 20 = 200`

 */
public class Rectangle {
    private int dluzszybok;
    private int krotszybok;

    Rectangle(int dluzszybok, int krotszybok) {
        this.dluzszybok = dluzszybok;
        this.krotszybok = krotszybok;
    }

    int pole() {
        return dluzszybok * krotszybok;
    }

    int obwod() {
        return 2 * dluzszybok + 2 * krotszybok;
    }

    boolean czyTakieSame(Rectangle inny) {
        return this.pole() == inny.pole();
    }

    static boolean czyTakieSame2(Rectangle first, Rectangle second) {
        return first.pole() == second.pole();
    }

    static boolean czyTakieSame3(Rectangle... tablicakwadratow) {

        for (int i = 1; i < tablicakwadratow.length; i++) {
            if (tablicakwadratow[i].pole() != tablicakwadratow [i-1].pole()){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "dluzszybok=" + dluzszybok +
                ", krotszybok=" + krotszybok +
                ", pole=" + pole() +
                ", obwód=" + obwod() +
                '}';
    }
}


