import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatedNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,1,2};
        duplicatedNumbers(arr);
    }

    public static void duplicatedNumbers(int[] arr){
        Map <Integer, Integer> map = new LinkedHashMap<>();
        for (int each : arr) {
            if (map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else
            map.put(each, 1);
        }
        System.out.println(map);
    }
}
