import java.util.*;

public class OrderingLetters {

    public static void main(String[] args) {

        String licensePlate = "ASL-1526";
        String str = licensePlate.replaceAll("[^a-zA-Z]", "");
        String word = "basketball";

        String s = word.replaceAll("[^asl]", "");

        Set<Character> plate = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            plate.add(str.charAt(i));
        }

        Set<Character> wordLetters = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            wordLetters.add(s.charAt(i));
        }

        if (plate.toString().equalsIgnoreCase(wordLetters.toString())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}