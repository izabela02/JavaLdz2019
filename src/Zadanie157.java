import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*ZADANIE #157*
Utwórz metodę która przyjmuje jako parametr ścieżkę do pliku, a następnie wyświetla:
- liczbę linii w pliku
- liczbę wyrazów w pliku
- liczbę znaków w pliku
 */
public class Zadanie157 {
    public static void main(String[] args) {

        try {
            List<String> testAnalysis = fileAnalyzer("Files/Zadanie156.txt");
            System.out.println(howManyLines(testAnalysis));
            System.out.println(howManyWords(testAnalysis));
            System.out.println(howManyWords(testAnalysis));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<String> fileAnalyzer(String filePath) throws IOException {

        FileReader readFile = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(readFile);

        List<String> analyzedFileAsList = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            analyzedFileAsList.add(line);
            line = bufferedReader.readLine(); // odczytuję kolejną linię
        }
        return analyzedFileAsList;
    }

    static int howManyLines(List<String> inputList) {
        return inputList.size();
    }

    static int howManyWords(List<String> inputList) {
        int lineCounter = 0;
        for (String s : inputList) {
            lineCounter += s.split("").length;

        }
        return lineCounter;
    }

    static int howManyChars(List<String> inputList) {
        int charCounter = 0;

        for (String s : inputList) {
            charCounter+=s.split("").length;
        }
        return charCounter;
    }
}
