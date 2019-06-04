package Day_01_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* *ZADANIE #160*
Utwórz metodę która odczytuje zawartości ze Scannera (do momentu podania pustej linii) i zapisuje wartości do pliku

 */
public class Zadanie160 {
    public static void main(String[] args) {

        try {
            saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void saveFile() throws IOException {

        Scanner scanner = new Scanner(System.in);
        FileWriter file = new FileWriter("Files/Zadanie160");
        BufferedWriter buff = new BufferedWriter(file);

        for (; ; ) {

            System.out.print("Podaj dane: ");
            String newData = scanner.nextLine();

            if (newData.equals("")) {
                break;
            }

            buff.write(newData);
            buff.newLine();
//            buff.flush();

        }

        buff.close();

    }

    static void saveFile2() {

        try (
                FileWriter file = new FileWriter("files/zad161");
                BufferedWriter buff = new BufferedWriter(file);
        ) {
            Scanner scanner = new Scanner(System.in);

            while(true) {

                System.out.print("Wpisz dane: ");
                String data = scanner.nextLine();

                if (data.equals("")) {
                    break;
                }

                buff.write(data);
                buff.newLine();     // dodaje pustą linię

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
