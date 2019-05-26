package Zadanie158;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        try {
            List<Osoba> osoby = listaOsob("Files/Zadanie158.csv");
            System.out.println(osoby);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static List<Osoba> listaOsob (String filePath) throws IOException {
        List<Osoba> result = new ArrayList<>();

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();

        while(line!=null) {
            Osoba analyze = analyze(line);
            result.add(analyze);
            line = bufferedReader.readLine();
        }
        return result;
    }
    private static Osoba analyze(String line) {
        String[] lineArray=line.split(",");
        return new Osoba(
                lineArray[0],
                lineArray[1],
                Integer.parseInt(lineArray[2]),
                Boolean.valueOf(lineArray[3])
        );
    }
}