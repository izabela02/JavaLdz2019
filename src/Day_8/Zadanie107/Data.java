package Day_8.Zadanie107;

public class Data {
    private Integer[] arr;

    public Data(int sizeOfArr) {
        arr = new Integer[sizeOfArr];
    }

    public void wstawienieNaKoniec(int num) {
        arr[arr.length - 1] = num;
    }

    public int rozmiar() {
        return arr.length;
    }

    public void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
    }

    public void spreadArr(int spread) {
        if (spread <= 0) {
            return;
        }
        Integer[] newArr = new Integer[arr.length + spread];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;

    }

    public void wstawienieNaPoczatek(int num) {
        arr[0] = num;
    }

    public void wstawianieDoIndeksu(int index, int wartosc) {
        arr[index] = wartosc;
    }

    public void usuniecieElementu(int index) {
        arr[index] = null;
    }

    public Integer najwiekszy() {
        Integer max = null;
        for (int i = 0; i < arr.length; i++) {
            Integer liczba = arr[i];
            if (liczba != null) {
                if (max == null) {
                    max = liczba;
                } else if (max < liczba) {
                    max = liczba;
                }
            }
        }
        return max;
    }
}
