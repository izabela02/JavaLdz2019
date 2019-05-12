/*
*ZADANIE #31*
Utwórz metodę, do której przekazujesz jeden parametr a następnie wyswietlasz tyle wielokrotności liczby `10`
> Dla `4` wyświetli `10, 20, 30, 40,`
>
> Dla `7` wyświetli `10, 20, 30, 40, 50, 60, 70,`
*/
public class Zadanie31 {
    public static void main(String[] args) {
        wielokrotnosc(4);
        wielokrotnosc1(4);

    }

    static void wielokrotnosc(int liczba) {
        for (int i = 1; i <= liczba; i++) { // musi być =, żeby wyświetliło nam 40
            System.out.println(i * 10); // aby była wielokrotność
        }


    }

    static void wielokrotnosc1(int num1) {
        for (int i = 10; i <= num1*10; i += 10) {
            System.out.println(i);
        }
    }


}