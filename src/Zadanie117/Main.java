package Zadanie117;

public class Main {
    public static void main(String[] args) {

            Kon kon = new Kon("Rafał", 2, "arabski");
            Kot kot = new Kot("Garfield", 3, "egzotyczny");
            Pies pies = new Pies("Leszek", 8, "kundel");

            Interakcja[] zwierzeta = {kon, kot, pies};

            for (int i = 0; i < zwierzeta.length; i++) {
                System.out.println(zwierzeta[i].dajGlos());
                System.out.println(zwierzeta[i].przedstawSie());
            }
        }
    }