package Zadanie117;

public interface Interakcja {
    String dajGlos();

    default String przedstawSie() {
        return "Jestem zwierzakiem.";
    }
}