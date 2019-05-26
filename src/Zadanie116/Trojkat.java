package Zadanie116;

public class Trojkat extends Ksztalt implements Obliczenia {
    private double podstawa;
    private double wysokosc;

    public Trojkat(double podstawa, double wysokosc) {
        this.podstawa = podstawa;

    }

    public Trojkat(double v) {
        super();
    }

    private double getWysokosc() {
        return podstawa * Math.sqrt(3) / 2;

    }

    @Override
    public String wyswietlInfo() {
        return String.format("Trójkąt równoboczny o boku %s", podstawa);
    }

    @Override
    public double policzPole() {
        return 0.5 * podstawa * wysokosc;
    }

    @Override
    public double policzObwod() {
        return 3 * podstawa;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return policzPole() * wysokosc;
    }
}
