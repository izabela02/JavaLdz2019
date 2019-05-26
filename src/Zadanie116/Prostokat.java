package Zadanie116;

public class Prostokat extends Ksztalt implements Obliczenia { // dziedziczę po kształcie
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double bok, double bok1) {
        super();
    }

    @Override
    public String wyswietlInfo() {
        return String.format("Prostokat o wymiarach %s x %s, dlugosc, szerokosc");
    }

    @Override
    public double policzPole() {
        return dlugosc * szerokosc;
    }

    @Override
    public double policzObwod() {
        return 2 * dlugosc + 2 * szerokosc;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return policzPole() * wysokosc;
    }


}
