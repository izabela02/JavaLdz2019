/*ZADANIE #24*
 Utwórz metodę, która przyjmuje dwa parametry - pierwszy to prędkość z jaką poruszał się Twój pojazd,
 a drugi to dopuszczalna prędkość. Metoda ma zwrocić wartość mandatu w przypadku przekroczenia dopuszczalnej prędkości.
 Każde przekroczenie o *rozpoczęte* 10 km/h to 100zł. Przykłady:
 > Dla prędkości `40` oraz dopuszczalnej `60` zwróci `0` (poprawna prędkość)
 >
 > Dla prędkości `60` oraz dopuszczalnej `60` zwróci `0`  (poprawna prędkość)
 >
 > Dla prędkości `70` oraz dopuszczalnej `60` zwróci `100` (ponieważ przekroczyłem o 10, a każde *rozpoczęte* 10 km/h = 100zł )
 >
 > Dla prędkości `81` oraz dopuszczalnej `60` zwróci `300` (ponieważ `81 - 60 = 10 + 10 + 1`, czyli mamy rozpoczęte `3` dziesiątki)
 >
 > Dla prędkości `89` oraz dopuszczalnej `60` zwróci `300` (ponieważ `89 - 60 = 10 + 10 + 9`, czyli mamy rozpoczęte `3` dziesiątki)
 >
 > Dla prędkości `91` oraz dopuszczalnej `60` zwróci `400` (ponieważ `91 - 60 = 10 + 10 + 10 + 1`, czyli mamy rozpoczęte `4` dziesiątki)
 >
 > Dla prędkości `140` oraz dopuszczalnej `60` zwróci `800`
 >
 > Dla prędkości `141` oraz dopuszczalnej `60` zwróci `900`
 */
public class Zadanie24 {
    public static void main(String[] args) {
        System.out.println(ticketValue(40, 60));
        System.out.println(ticketValue(60,60));
        System.out.println(ticketValue(70,60));
        System.out.println(ticketValue(81,60));
        System.out.println(ticketValue(89,60));
        System.out.println(ticketValue(91,60));
        System.out.println(ticketValue(140,60));
        System.out.println(ticketValue(141,60));

    }

    static int ticketValue(int speed, int limit) {
        int overSpeedLimit = speed - limit; // liczę o ile przekroczyli prędkość
        if (overSpeedLimit > 0) {
            int value = overSpeedLimit / 10; // liczę ile razy przekroczyli o 10
            int rest = overSpeedLimit % 10; // liczę przez modulo resztę
            if (rest > 0) {
                // value += 100 - dodaje do wartości value wartość 100
                value++; // zwiększa wartość value o 1

            }
                return value * 100; // mnożę przez kwotę mandatu za każde przekroczone 10km/h

            } else {
                return 0;
            }


        }
    }

