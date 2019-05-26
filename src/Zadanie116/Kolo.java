package Zadanie116;

public class Kolo extends Ksztalt implements Obliczenia {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public String wyswietlInfo() {
        return String.format("Koło o promieniu %s", promien);
    }

    @Override
    public double policzPole() {
        return Math.PI * Math.pow(promien, 2);
    }

    @Override
    public double policzObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return policzPole() * wysokosc;
    }
}
