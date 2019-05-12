/*
Utwórz metodę, do której przekazujesz dwa parametry. Metoda ma wyświetlić wszystkie
potęgi pierwszej liczby do momentu nie przekroczenia drugiej liczby.
> dla `3, 100` wyświetli:
>
```0 -> 1
1 -> 3
2 -> 9
3 -> 27
4 -> 81 (kolejny krok dałby 243, więc przekroczyłby 100)```

> dla `4, 300` wyświetli:
>
```0 -> 1
1 -> 4
2 -> 16
3 -> 64
4 -> 256 (kolejny krok dałby 1024, więc przekroczyłby 300)```
 */
public class Zadanie32 {
    public static void main(String[] args) {
        potęga(4, 300);
        potęga(3,100);

    }

    static void potęga(int a, int b) {
        for (int i = 0; Math.pow(a, i) <= b; i++) {
            double num = Math.pow(a, i);
            System.out.println(i + "-->" + num);
        }
    }
}

