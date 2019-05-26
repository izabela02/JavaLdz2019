package Zadanie156;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       // try {
            // print("Files/Zadanie156.txt");
            //  } catch (IOException e) {
            //   e.printStackTrace();

            try {
                printPoZnakach("Files/Zadanie156.txt");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }




    static void print(String nazwaPliku) throws IOException {
        FileReader read = new FileReader(nazwaPliku);
        BufferedReader reader = new BufferedReader(read);
        String linia = reader.readLine();
        while (linia != null) {
            System.out.println(linia);
            linia = reader.readLine();
        }
    }

    static void printPoZnakach(String nazwaPliku) throws IOException {
        FileInputStream file = new FileInputStream(nazwaPliku);
        int znak = file.read();
        while (znak != -1) {
            System.out.print((char)znak);
            znak = file.read();


        }
    }
}
