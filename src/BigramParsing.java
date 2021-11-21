import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class BigramParsing {

    public static String readTextFile(String file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String wholeText = null;
        StringBuilder textFromFile = new StringBuilder();
        String line = bufferedReader.readLine();

        while (line != null) {
            textFromFile.append(line);
            line = bufferedReader.readLine();
            wholeText = textFromFile.toString();
            bufferedReader.close();
        }
        return wholeText;
    }


    public static LinkedHashMap<String, Integer> occurrenceOfText(String givenText) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String[] split = givenText.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        if (split.length < 2)
            return null;

        for (int i = 0; i < split.length - 1; i++) {
            String str = split[i] + " " + split[i + 1];
            str = str.toLowerCase();
            if (map.get(str) != null) {
                map.replace(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }


    public static void printMap(LinkedHashMap<String, Integer> map) {
        if (map != null)
            for (String key : map.keySet()) {
                String value = map.get(key).toString();
                System.out.println("\"" + key + "\"" + " " + value);
            }
    }


    public static void main(String[] args) throws IOException {
        String wholeText = readTextFile("TextFile.csv");
        LinkedHashMap<String, Integer> map = occurrenceOfText(wholeText);
        printMap(map);
    }
}