package Zadanie114;

public class Main {
    public static void main(String[] args) {

        Produkt d = new Długopis();
        Produkt k = new Książka();
        Produkt p = new Plecak();
        Produkt z = new Zeszyt();

        Produkt [] produkty = {d,k,p,z};
        for (int i =0; i< produkty.length; i++) produkty[i].wyswietlInformacje();
}
}