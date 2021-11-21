import java.util.*;

public class CountRepeatedWords {

    public static void main(String[] args) {
        countDuplicated("Java is fun, java is interesting, I love java. Java is the best");
    }

    public static void countDuplicated(String sentence){
        String[] split = sentence.replaceAll("[,.]", "").split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : split) {
            each = each.toLowerCase();
            if (map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }
            else{
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
